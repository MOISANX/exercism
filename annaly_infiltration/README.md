# Missão de Resgate da Annalyn

Neste exercício, você implementará a lógica da missão para um novo jogo de RPG que um amigo está desenvolvendo. A personagem principal do jogo é Annalyn, uma garota corajosa com um cachorro de estimação feroz e leal. Infelizmente, ocorre um desastre, pois sua melhor amiga foi sequestrada enquanto procurava frutas na floresta. Annalyn tentará encontrar e libertar sua melhor amiga, opcionalmente levando seu cachorro com ela nesta missão.

Depois de algum tempo seguindo a trilha de sua melhor amiga, ela encontra o acampamento onde sua melhor amiga está presa. Acontece que existem dois sequestradores: um cavaleiro poderoso e um arqueiro astuto.

Tendo encontrado os sequestradores, Annalyn considera quais das seguintes ações ela pode realizar:

- Ataque rápido: um ataque rápido pode ser feito se o cavaleiro estiver dormindo, pois leva tempo para ele colocar a armadura, então ficará vulnerável.
- Espião: o grupo pode ser espionado se pelo menos um deles estiver acordado. Caso contrário, espionar é uma perda de tempo.
- Sinalizar prisioneiro: o prisioneiro pode ser sinalizado por meio de sons de pássaros se o prisioneiro estiver acordado e o arqueiro estiver dormindo, pois os arqueiros são treinados em sinalização de pássaros, para que possam interceptar a mensagem.
- Prisioneiro livre: Annalyn pode tentar entrar furtivamente no acampamento para libertar o prisioneiro. Isso é algo arriscado de se fazer e só pode ter sucesso de duas maneiras:
  - Se Annalyn tiver seu cachorro de estimação, ela poderá resgatar o prisioneiro se o arqueiro estiver dormindo. O cavaleiro está com medo do cachorro e o arqueiro não terá tempo de se preparar antes que Annalyn e o prisioneiro possam escapar.
  - Se Annalyn não tem seu cachorro, ela e o prisioneiro devem ser muito sorrateiros! Annalyn pode libertar o prisioneiro se o prisioneiro estiver acordado e o cavaleiro e o arqueiro estiverem dormindo, mas se o prisioneiro estiver dormindo, eles não poderão ser resgatados: o prisioneiro ficaria surpreso com a aparição repentina de Annalyn e acordaria o cavaleiro e o arqueiro.

## Instruções

Você tem quatro tarefas: implementar a lógica para determinar se as ações acima estão disponíveis com base no estado dos três personagens encontrados na floresta e se o cachorro de estimação de Annalyn está presente ou não.

1. Verifique se um ataque rápido pode ser feito

   Implemente o método (estático) `AnnalynsInfiltration.canFastAttack()` que assume um valor booleano que indica se o cavaleiro está acordado. Este método retorna true se um ataque rápido puder ser feito com base no estado do cavaleiro. Caso contrário, retorna false:

   ```java
   boolean knightIsAwake = true;
   AnnalynsInfiltration.canFastAttack(knightIsAwake);
   // => false

2. Verifique se o grupo pode ser espionado

Implemente o método (estático) `AnnalynsInfiltration.canSpy()` que assume três valores booleanos, indicando se o cavaleiro, o arqueiro e o prisioneiro, respectivamente, estão acordados. O método retorna true se o grupo puder ser espionado, com base no estado dos três personagens. Caso contrário, retorna false:

```java
boolean knightIsAwake = false;
boolean archerIsAwake = true;
boolean prisonerIsAwake = false;
AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
// => true 
```

3. Verifique se o prisioneiro pode ser sinalizado

Implemente o método (estático) `AnnalynsInfiltration.canSignalPrisoner()` que assume dois valores booleanos, indicando se o arqueiro e o prisioneiro, respectivamente, estão acordados. O método retorna true se o prisioneiro puder ser sinalizado, com base no estado dos dois personagens. Caso contrário, retorna false:

```java
boolean archerIsAwake = false;
boolean prisonerIsAwake = true;
AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
// => true
```

4. Verifique se o prisioneiro pode ser libertado

Implemente o método (estático) `AnnalynsInfiltration.canFreePrisoner()` que aceita quatro valores booleanos. Os três primeiros parâmetros indicam se o cavaleiro, o arqueiro e o prisioneiro, respectivamente, estão acordados. O último parâmetro indica se o cachorro de estimação de Annalyn está presente. O método retorna true se o prisioneiro puder ser libertado com base no estado dos três personagens e na presença do cachorro de estimação de Annalyn. Caso contrário, ele retorna false:

```java

boolean knightIsAwake = false;
boolean archerIsAwake = true;
boolean prisonerIsAwake = false;
boolean petDogIsPresent = false;
AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
// => false
```