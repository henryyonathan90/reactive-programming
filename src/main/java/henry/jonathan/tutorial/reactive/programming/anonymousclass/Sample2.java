package henry.jonathan.tutorial.reactive.programming.anonymousclass;

/**
 * Material and some sample taken from https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
 */
public class Sample2 {

  public static void main(String[] args) {
    HelloInterface helloImpl = new HelloInterface() {
      String textFormat = "Hello %s from anonymous class.";

      public void greet() {
        System.out.println(String.format(textFormat, "world"));
      }

      public void greetSomeone(String name) {
        System.out.println(String.format(textFormat, name));
      }
    };

    helloImpl.greet();
    helloImpl.greetSomeone("Henry");
  }

}
