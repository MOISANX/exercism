# Bird Watcher

Este é um programa simples para acompanhar a quantidade de pássaros que visitaram o seu jardim ao longo da última semana. O programa possui as seguintes funcionalidades:

1. **Check what the counts were last week**
   - `BirdWatcher.getLastWeek();`
   - Retorna um array com as contagens da semana passada: `[0, 2, 5, 3, 7, 8, 4]`

2. **Check how many birds visited today**
   - `BirdWatcher.getToday();`
   - Retorna a quantidade de pássaros que visitaram o jardim hoje.

3. **Increment today's count**
   - `BirdWatcher.incrementTodaysCount();`
   - Incrementa a contagem de pássaros de hoje.

4. **Check if there was a day with no visiting birds**
   - `BirdWatcher.hasDayWithoutBirds();`
   - Retorna true se houve um dia sem visitas de pássaros, caso contrário, retorna false.

5. **Calculate the number of visiting birds for the first number of days**
   - `BirdWatcher.getCountForFirstDays(numDays);`
   - Retorna a quantidade total de pássaros que visitaram o jardim nos primeiros `numDays` dias da semana.

6. **Calculate the number of busy days**
   - `BirdWatcher.getBusyDays();`
   - Retorna o número de dias em que cinco ou mais pássaros visitaram o jardim.


