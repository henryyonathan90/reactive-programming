package henry.jonathan.tutorial.reactive.programming.observerpattern;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import java.util.function.Supplier;

public class CustomPublisher implements Publisher {

  private Supplier<String> stringSupplier;

  public CustomPublisher(Supplier<String> supplier) {
    this.stringSupplier = supplier;
  }

  public void subscribe(Subscriber s) {
    s.onNext(stringSupplier.get());
    s.onComplete();
  }
}
