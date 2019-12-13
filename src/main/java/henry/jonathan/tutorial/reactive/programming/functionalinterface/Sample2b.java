package henry.jonathan.tutorial.reactive.programming.functionalinterface;

/**
 * Sample for lambda expression
 */
public class Sample2b {

  public static void main(String[] args) {
    StringProcessor stringProcessor = str -> str.toUpperCase();

    System.out.println(stringProcessor.process("some text"));
  }

}
