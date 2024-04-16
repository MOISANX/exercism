public class Lasagna {
  
  public static int expectedMinutesInOven() {
    return 40;
  }

  public static int remainingMinutesInOven(int actualMinutesInOven) {
    return expectedMinutesInOven() - actualMinutesInOven;
  }

  public static int preparationTimeInMinutes(int numberOfLayers) {
    return numberOfLayers * 2;
  }

  public static int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
    return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
  }
  //Não é necessario colocar o main , é só para demostrar como se utiliza mesmo.
  public static void main(String[] args) {
    Lasagna lasagna = new Lasagna();
    
    System.out.println("Time the prepare: "+ lasagna.expectedMinutesInOven());
    System.out.println("remaining Minutes In Oven: " +lasagna.remainingMinutesInOven(25));
    System.out.println("preparation Time In Minutes: "+  lasagna.preparationTimeInMinutes(4));
    System.out.println("total Time In Minutes: "+ lasagna.totalTimeInMinutes(4, 25));


  }
}
