package henry.jonathan.tutorial.reactive.programming.anonymousclass;

/**
 * Material and some sample taken from https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
 *
 * Sample for normal class
 */
public class Sample1 {

  public static void main(String[] args) {
    HelloInterface helloImpl = new HelloImpl();

    helloImpl.greet();
    helloImpl.greetSomeone("John");
  }

}
