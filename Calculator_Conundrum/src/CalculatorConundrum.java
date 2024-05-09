public class CalculatorConundrum {

  public String calculate(int operand1, int operand2, String operation) {
     int result = 0;
    if (operation.equals("+")) {
       result = operand1 + operand2;

      }
      
      return String.valueOf(result);
     
    }
}
