package henry.jonathan.tutorial.reactive.programming.observerpattern;

public class Sample1 {

  public static void main(String[] args) {
    CustomPublisher customPublisher = new CustomPublisher(() -> "test string");
    CustomSubscriber customSubscriber = new CustomSubscriber();

    customPublisher.subscribe(customSubscriber);
  }

}
