package henry.jonathan.tutorial.reactive.programming.observerpattern;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import java.util.function.Supplier;

public class SingleLikePublisher implements Publisher {

  private Supplier<String> stringSupplier;

  public SingleLikePublisher(Supplier<String> supplier) {
    this.stringSupplier = supplier;
  }

  @Override
  public void subscribe(Subscriber s) {
    s.onNext(stringSupplier.get());
    s.onComplete();
  }

  public void subscribe() {
    subscribe(new CustomSubscriber());
  }

  public static SingleLikePublisher just(String s) {
    return new SingleLikePublisher(() -> s);
  }

  public static SingleLikePublisher create(Supplier<String> supplier) {
    return new SingleLikePublisher(supplier);
  }
}
