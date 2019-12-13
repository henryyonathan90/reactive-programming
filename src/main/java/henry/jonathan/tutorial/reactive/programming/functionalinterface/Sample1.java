package henry.jonathan.tutorial.reactive.programming.functionalinterface;

/**
 * Sample for normal class
 */
public class Sample1 {

  public static void main(String[] args) {
    StringProcessor stringProcessor = new StringProcessorImpl();
    System.out.println(stringProcessor.process("some text"));
  }
}
