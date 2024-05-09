# Lista de Idiomas para Aprender

## Funcionalidades

1. **Verificar se a lista de idiomas está vazia:**
   - Método: `isEmpty()`
   - Uso:
     ```java
     if (languageList.isEmpty()) {
         findMoreLanguagesToLearn();
     }
     ```

2. **Adicionar um idioma à lista:**
   - Método: `addLanguage(String language)`
   - Uso:
     ```java
     languageList.addLanguage("Kotlin");
     languageList.addLanguage("Python");
     ```

3. **Remover um idioma da lista:**
   - Método: `removeLanguage(String language)`
   - Uso:
     ```java
     languageList.removeLanguage("Scala");
     ```

4. **Retornar o primeiro item da lista:**
   - Método: `firstLanguage()`
   - Uso:
     ```java
     String firstLanguage = languageList.firstLanguage(); // "Kotlin"
     ```

5. **Retornar quantos idiomas estão na lista:**
   - Método: `count()`
   - Uso:
     ```java
     int numberOfLanguages = languageList.count(); // 2
     ```

6. **Determinar se um idioma está na lista:**
   - Método: `containsLanguage(String language)`
   - Uso:
     ```java
     boolean learningPython = languageList.containsLanguage("Python"); // true
     boolean learningRuby = languageList.containsLanguage("Ruby"); // false
     ```

7. **Determinar se a lista é interessante:**
   - Método: `isExciting()`
   - Uso:
     ```java
     boolean isExciting = javaLanguageList.isExciting(); // true
     boolean isNotExciting = neitherKotlinNorJavaLanguageList.isExciting(); // false
     ```
