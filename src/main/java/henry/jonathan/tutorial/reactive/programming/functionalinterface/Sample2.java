package henry.jonathan.tutorial.reactive.programming.functionalinterface;

public class Sample2 {

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
