package henry.jonathan.tutorial.reactive.programming.observerpattern;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class CustomSubscriber implements Subscriber<String> {
  public void onSubscribe(Subscription s) {
    //DO NOTHING
  }

  public void onNext(String s) {
    System.out.println(String.format("Subscriber have received string \"%s\" from publisher", s));
  }

  public void onError(Throwable t) {
    //DO NOTHING
  }

  public void onComplete() {
    System.out.println("Subscriber have received complete signal from publisher");
  }
}
