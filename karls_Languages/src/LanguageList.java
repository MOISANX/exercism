import java.util.ArrayList;
import java.util.List;

public class LanguageList {

  private final List<String> languages = new ArrayList<>();

  public boolean isEmpty() {
    return languages.isEmpty();
  }

  public void addLanguage(String language) {
    languages.add(language);
  }

  public String firstLanguage() {
    if (isEmpty()) {
      throw new IllegalStateException("Language list is empty");
    }
    return languages.get(0);
  }

  public int count() {
    return languages.size();
  }

  public boolean containsLanguage(String language) {

    return languages.contains(language);
  }

  public boolean isExciting() {

    return languages.contains("Java") || languages.contains("Kotlin");
  }

  public static void main(String[] args) {
    LanguageList languageList = new LanguageList();
    languageList.addLanguage("Java");
    languageList.addLanguage("Kotlin");
    languageList.addLanguage("Python");

    if (languageList.isEmpty()) {
      System.out.println("A lista de idomas esta vazia");
    } else {
      System.out.println("A lista não esta vazia");
    }

    System.out.println("O primeoro idoma da lista é: " + languageList.firstLanguage());

    System.out.println("O numero de idiomas na lista é: " + languageList.count());

    boolean learningPython = languageList.containsLanguage("Python");
    System.out.println("Esta aprendendo Python ? " + learningPython);
    if (learningPython == true) {
      System.out.println("Não esqueça de estudar todos os dias");
    } else {
      System.out.println("O que voce esta esperando para começar essa otima linguagem");
    }
    boolean learningRuby = languageList.containsLanguage("Ruby");
    System.out.println("Esta aprendendo Ruby ? " + learningRuby);
    if (learningRuby == true) {
      System.out.println("Não esqueça de estudar todos os dias");
    } else {
      System.out.println("O que voce esta esperando para começar essa otima linguagem");
    }

    System.out.println("A lista é emocionante ? " + languageList.isExciting());
  }

}
