package henry.jonathan.tutorial.reactive.programming.observerpattern;

import java.util.function.Supplier;

/**
 * Sample of custom publisher similar like Single in RxJava
 */
public class Sample3 {

  public static void main(String[] args) {
    //Similar like sample1, but create custom publisher that similar like Single.create
    SingleLikePublisher publisher = SingleLikePublisher.create(someOtherMethod());

    System.out.println("Begin subscribing");
    publisher.subscribe();
    System.out.println("Finished subscribing");
  }

  private static Supplier<String> someOtherMethod() {
    System.out.println("this is print from someOtherMethod");
    return () -> {
      System.out.println("this is print from inside provided supplier");
      return "text from provided supplier";
    };
  }

}
