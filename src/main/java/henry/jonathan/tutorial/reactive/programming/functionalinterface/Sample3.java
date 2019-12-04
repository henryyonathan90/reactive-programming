package henry.jonathan.tutorial.reactive.programming.functionalinterface;

public class Sample3 {

  public static void main(String[] args) {
    StringProcessor stringProcessor = (str -> {
      System.out.println("print from provided supplier");
      String result;
      result = str.toUpperCase();
      result = result.trim();
      result = result.replaceAll(" ", "");
      return result;
    });

    System.out.println("print from before running the process");
    System.out.println(stringProcessor.process(" som e sa m   ple text"));
  }

}
