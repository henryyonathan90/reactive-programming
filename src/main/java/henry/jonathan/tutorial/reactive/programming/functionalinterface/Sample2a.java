package henry.jonathan.tutorial.reactive.programming.functionalinterface;

/**
 * Sample for anonymous class
 */
public class Sample2a {

  public static void main(String[] args) {
    StringProcessor stringProcessor = new StringProcessor() {
      @Override
      public String process(String input) {
        return input.toUpperCase();
      }
    };

    System.out.println(stringProcessor.process("some text"));
  }

}
