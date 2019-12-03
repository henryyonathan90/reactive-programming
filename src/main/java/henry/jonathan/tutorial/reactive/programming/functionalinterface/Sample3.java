package henry.jonathan.tutorial.reactive.programming.functionalinterface;

public class Sample3 {

  public static void main(String[] args) {
    StringProcessor stringProcessor = (str -> {
      String result;
      result = str.toUpperCase();
      result = result.trim();
      result = result.replaceAll(" ", "");
      return result;
    });

    System.out.println(stringProcessor.process(" coba te xt in i jadi a p  a"));
  }

}
