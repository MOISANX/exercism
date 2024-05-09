# Instruções

Neste exercício você criará um tratamento de erros para uma calculadora de números inteiros simples. Para simplificar as coisas, são fornecidos métodos para calcular adição, multiplicação e divisão.

O objetivo é ter uma calculadora funcional que retorne uma String com o seguinte padrão: `16 + 51 = 67` quando fornecida com argumentos `16` e `51` e `+`.

```java
CalculatorConundrum calculator = new CalculatorConundrum();

calculator.calculate(16, 51, "+");
// => returns "16 + 51 = 67"

calculator.calculate(32, 6, "*");
// => returns "32 * 6 = 192"

calculator.calculate(512, 4, "/");
// => returns "512 / 4 = 128"


Claro! Você pode criar um arquivo README.md com o texto fornecido da seguinte forma:

markdown
Copy code
# Instruções

Neste exercício você criará um tratamento de erros para uma calculadora de números inteiros simples. Para simplificar as coisas, são fornecidos métodos para calcular adição, multiplicação e divisão.

O objetivo é ter uma calculadora funcional que retorne uma String com o seguinte padrão: `16 + 51 = 67` quando fornecida com argumentos `16` e `51` e `+`.

```java
CalculatorConundrum calculator = new CalculatorConundrum();

calculator.calculate(16, 51, "+");
// => returns "16 + 51 = 67"

calculator.calculate(32, 6, "*");
// => returns "32 * 6 = 192"

calculator.calculate(512, 4, "/");
// => returns "512 / 4 = 128"
# Implemente o método calcular para suportar algumas operações básicas

O principal método de implementação nesta tarefa será o CalculatorConundrum.calculate() método. São necessários três argumentos. Os dois primeiros argumentos operand1 e operand2 são números inteiros nos quais uma operação irá operar. O terceiro argumento operation é do tipo String e para este exercício é necessário implementar as seguintes operações:

adição usando a + String
multiplicação usando a * String
divisão usando a / String

# Lidar com operações ilegais

Atualize o CalculatorConundrum.calculate() método para lidar com operações ilegais:

Quando o operation argumento for null, um IllegalArgumentException deverá ser lançado com a mensagem "Operation cannot be null".
Quando o operation argumento for "", um IllegalArgumentException deverá ser lançado com a mensagem "Operation cannot be empty".
Quando o operation argumento é qualquer operação diferente de +, *, ou /, um IllegalOperationException deve ser lançado com a mensagem "Operation '{operation}' does not exist".

calculator.calculate(10, 1, null);
// => throws IllegalArgumentException with message "Operation cannot be null"

calculator.calculate(10, 1, "");
// => throws IllegalArgumentException with message "Operation cannot be empty"

calculator.calculate(10, 1, "-");
// => throws IllegalOperationException with message "Operation '-' does not exist"

# Trate a exceção lançada ao dividir por zero

Em Java, tentar dividir por zero gera um arquivo ArithmeticException. Atualize o CalculatorConundrum.calculate() método para capturar essa exceção e, em seguida, lance um IllegalOperationException com a mensagem "Division by zero is not allowed" e o capturado ArithmeticException como causa.

calculator.calculate(10, 0, "/");
// => throws IllegalOperationException with message "Division by zero is not allowed"
