package henry.jonathan.tutorial.reactive.programming.functionalparadigm;

import java.util.ArrayList;
import java.util.List;

/**
 * Sample taken from Functional Thinking - Paradigm over Syntax by Neal Ford chapter 2
 * Imperative Programming - perform operations within loops
 */
public class Sample1 {

  public static void main(String[] args) {
    List<String> listOfNames = new ArrayList<>();
    listOfNames.add("alice");
    listOfNames.add("bob");
    listOfNames.add("c");
    listOfNames.add("daisy");
    listOfNames.add("eric");
    listOfNames.add("f");

    StringBuilder builder = new StringBuilder();

    for (String name : listOfNames) {
      if (name.length() > 1) {
        builder.append(capitalizeString(name)).append(",");
      }
    }

    System.out.println(builder.substring(0, builder.length() - 1));
  }

  private static String capitalizeString(String s) {
    return s.substring(0, 1).toUpperCase() + s.substring(1);
  }

}
