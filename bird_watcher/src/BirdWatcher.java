public class BirdWatcher {
  private final int[] birdsPerDay;
  private final int[] lastWeekCounts = { 0, 2, 5, 3, 7, 8, 4 };


  public BirdWatcher(int[] birdsPerDay) {
    this.birdsPerDay = birdsPerDay.clone();
  }

  public int[] getLastWeek() {
    return lastWeekCounts.clone();
  }

  public int getToday() {
    int ultimateElementy = lastWeekCounts[lastWeekCounts.length - 1];
    return ultimateElementy;
  }

  public void incrementTodaysCount() {
    int ultimateElementy = lastWeekCounts[lastWeekCounts.length - 1];
    lastWeekCounts[lastWeekCounts.length - 1] = ultimateElementy + 1;

  }

  public boolean hasDayWithoutBirds() {
    for (int count : birdsPerDay) {
      if (count == 0) {
        return true;
      }
    }
    return false;
  }

  public int getCountForFirstDays(int numberOfDays) {
    int count = 0;
    for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
      count += birdsPerDay[i];
    }
    return count;
  }

  public int getBusyDays() {
    int busyDays = 0;
    for (int count : birdsPerDay) {
      if (count >= 5) {
        busyDays++;
      }
    }
    return busyDays;

  }

 
}
