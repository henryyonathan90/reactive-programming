package henry.jonathan.tutorial.reactive.programming.functionalparadigm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Sample taken from Functional Thinking - Paradigm over Syntax by Neal Ford chapter 2
 * Functional Programming - filter, transform, convert
 */
public class Sample2 {

  public static void main(String[] args) {
    List<String> listOfNames = new ArrayList<>();
    listOfNames.add("alice");
    listOfNames.add("bob");
    listOfNames.add("c");
    listOfNames.add("daisy");
    listOfNames.add("eric");
    listOfNames.add("f");

    String result = listOfNames.stream()
        .filter(s -> s.length() > 1)
        .map(s -> capitalizeString(s))
        .collect(Collectors.joining(","));

    System.out.println(result);
  }

  private static String capitalizeString(String s) {
    System.out.println("A");
    return s.substring(0, 1).toUpperCase() + s.substring(1);
  }

}
