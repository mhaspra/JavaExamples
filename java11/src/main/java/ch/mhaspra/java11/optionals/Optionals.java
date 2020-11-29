package ch.mhaspra.java11.optionals;

import java.util.Optional;

public class Optionals {
  public static void main(String[] args) {
    Optional<String> present = Optional.ofNullable("present");
    Optional<String> notPresent = Optional.empty();

    present.ifPresentOrElse(Optionals::printIsPresent, Optionals::printElseValue);
    notPresent.ifPresentOrElse(Optionals::printIsPresent, Optionals::printElseValue);

    System.out.println("Optional value is " + present.or(() -> Optional.of("not present")).get());
    System.out.println("Optional value is " + notPresent.or(() -> Optional.of("not present")).get());

    present.stream().forEach(Optionals::printIsPresent);
    notPresent.stream().forEach(Optionals::printIsPresent);
  }

  private static void printIsPresent(String value){
    System.out.println("Optional value is " + value);
  }

  private static   void printElseValue(){
    System.out.println("Optional value is not present");
  }
}
