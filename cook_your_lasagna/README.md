# Lasanha Brilhante

Neste exercício, você escreverá alguns códigos para ajudá-lo a preparar uma lasanha brilhante com base no seu livro de culinária favorito.

## Instruções

Você tem quatro tarefas, todas relacionadas ao tempo gasto no cozimento da lasanha.

1. Defina o tempo esperado de forno em minutos
   - Defina o `expectedMinutesInOven()` método que não leva nenhum parâmetro e retorna quantos minutos a lasanha deve ficar no forno. De acordo com o livro de culinária, o tempo esperado do forno em minutos é 40:
     ```java
     Lasagna lasagna = new Lasagna();
     lasagna.expectedMinutesInOven();
     // => 40
     ```

2. Calcule o tempo restante do forno em minutos
   - Defina o `remainingMinutesInOven()` método que leva como parâmetro os minutos reais que a lasanha está no forno e retorna quantos minutos a lasanha ainda tem para permanecer no forno, com base no tempo de forno esperado em minutos da tarefa anterior.
     ```java
     Lasagna lasagna = new Lasagna();
     lasagna.remainingMinutesInOven(30);
     // => 10
     ```

3. Calcule o tempo de preparo em minutos
   - Defina o `preparationTimeInMinutes()` método que leva como parâmetro o número de camadas que você adicionou à lasanha e retorna quantos minutos você gastou preparando a lasanha, assumindo que cada camada leva 2 minutos para ser preparada.
     ```java
     Lasagna lasagna = new Lasagna();
     lasagna.preparationTimeInMinutes(2);
     // => 4
     ```

4. Calcule o tempo total de trabalho em minutos
   - Defina o `totalTimeInMinutes()` método que leva dois parâmetros: o primeiro parâmetro é o número de camadas que você adicionou à lasanha e o segundo parâmetro é o número de minutos que a lasanha ficou no forno. A função deve retornar quantos minutos no total você trabalhou no cozimento da lasanha, que é a soma do tempo de preparo em minutos, e o tempo em minutos que a lasanha ficou no forno no momento.
     ```java
     Lasagna lasagna = new Lasagna();
     lasagna.totalTimeInMinutes(3, 20);
     // => 26
     ```
