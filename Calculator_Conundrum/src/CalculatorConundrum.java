public class CalculatorConundrum {

  public String calculate(int operand1, int operand2, String operation) {
    if(operation == null) {
      throw new IllegalArgumentException("Operation cannot be null");
    }
    if(operation.isEmpty()){
      throw new IllegalArgumentException("Operation cannot be empty");
    }

    switch (operation) {
      case "+":
          return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
      
          case "*":
          return operand1 + " * " + operand2 + " = " +  (operand1 * operand2);

          case "/":
             try {
                 if(operand2 == 0){
                   throw new ArithmeticException("Division by zero is not allowed");
                 }
                 return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
             } catch (ArithmeticException e){
              throw new IllegalArgumentException ("Division by zero is not allowed", e);
             }
        
    
      default:
      throw new IllegalArgumentException("Operation '"+ operation +"' does not exist");
      
    }

    
     
 }

 public static void main(String[] args) {
     CalculatorConundrum calculatorConundrum =  new CalculatorConundrum();

    System.out.println(calculatorConundrum.calculate(10, 5, "/")); 


 }
}
