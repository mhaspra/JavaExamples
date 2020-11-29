package ch.mhaspra.java11.optionals;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OptionalsTest {
  @Test
  void orElseThrowsReturnsValueWhenItIsPresent(){
    var value = "A value";
    Optional<String> optionalValue = Optional.of(value);

    assertEquals(value, optionalValue.orElseThrow());
  }

  @Test
  void orElseThrowsThrowsWhenValueIsNotPresent(){
    Optional<String> optionalValue = Optional.empty();

    assertThrows(NoSuchElementException.class, optionalValue::orElseThrow);
  }
}
