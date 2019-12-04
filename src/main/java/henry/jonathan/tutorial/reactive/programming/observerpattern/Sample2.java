package henry.jonathan.tutorial.reactive.programming.observerpattern;

/**
 * Sample of custom publisher similar like Single in RxJava
 */
public class Sample2 {

  public static void main(String[] args) {
    //Similar like sample2, but create a mistake using like Single.just
    SingleLikePublisher publisher = SingleLikePublisher.just(someOtherMethod());

    System.out.println("Begin subscribing");
    publisher.subscribe();
    System.out.println("Finished subscribing");
  }

  private static String someOtherMethod() {
    System.out.println("this is print from someOtherMethod");
    return "text from some other method";
  }

}
