package henry.jonathan.tutorial.reactive.programming.anonymousclass;

public class HelloImpl implements HelloInterface {
  String textFormat = "Hello %s!";

  @Override
  public void greet() {
    System.out.println(String.format(textFormat, "world"));
  }

  @Override
  public void greetSomeone(String name) {
    System.out.println(String.format(textFormat, name));
  }
}
