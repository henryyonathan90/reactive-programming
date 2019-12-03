package henry.jonathan.tutorial.reactive.programming.functionalinterface;

public class Sample3 {

  public static void main(String[] args) {
    StringProcessor stringProcessor = (str -> str.toUpperCase());

    System.out.println(stringProcessor.process("some text"));
  }

}
