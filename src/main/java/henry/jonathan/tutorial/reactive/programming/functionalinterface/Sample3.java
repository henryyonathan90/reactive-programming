package henry.jonathan.tutorial.reactive.programming.functionalinterface;

/**
 * Sample for lambda expression 2
 */
public class Sample3 {

  public static void main(String[] args) {
    StringProcessor stringProcessor = str -> {
      System.out.println("A");
      String result;
      result = str.toUpperCase();
      result = result.trim();
      result = result.replaceAll(" ", "");
      return result;
    };

    System.out.println("B");
    System.out.println(stringProcessor.process(" som e sa m   ple text"));
  }

}
