public class AnnalynsInfiltration {
  public static boolean canFastAttack(boolean knightIsAwake) {
    return !knightIsAwake;
  }

  public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
    return knightIsAwake && !archerIsAwake && !prisonerIsAwake
        || !knightIsAwake && archerIsAwake && !prisonerIsAwake
        || !knightIsAwake && !archerIsAwake && prisonerIsAwake
        || !knightIsAwake && archerIsAwake && prisonerIsAwake
        || knightIsAwake && !archerIsAwake && prisonerIsAwake
        || knightIsAwake && archerIsAwake && !prisonerIsAwake
        || knightIsAwake && archerIsAwake && prisonerIsAwake;
  }

  public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
    return !archerIsAwake && prisonerIsAwake;
  }

  public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
      boolean petDogIsPresent) {
    if (petDogIsPresent) {
      if (!archerIsAwake) {
        return true;
      } else {
        return false;
      }
    } else {
      if (!prisonerIsAwake && !knightIsAwake && !archerIsAwake) {
        return false;
      } else if (prisonerIsAwake && !knightIsAwake && !archerIsAwake) {
        return true;
      } else {
        return false;
      }
    }
  }

  // Não é necessario colocar o main , é só para demostrar como se utiliza mesmo.
  public static void main(String[] args) {
    AnnalynsInfiltration annalynsInfiltration = new AnnalynsInfiltration();
    boolean knightIsAwake = false ;


    System.out.println(annalynsInfiltration.canFastAttack(knightIsAwake));

  }
}
