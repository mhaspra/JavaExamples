package ch.mhaspra.java11.collections;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class HelperMethodsTest {
  @Test
  public void listIsImmutable(){
    List<String> list = List.of("one", "two", "three");

    assertThrows(UnsupportedOperationException.class, () -> list.add("four"));
  }

  @Test
  public void setIsImmutable(){
    Set<String> set = Set.of("one", "two", "three");

    assertThrows(UnsupportedOperationException.class, () -> set.add("four"));
  }

  @Test
  public void mapIsImmutable(){
    Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three");

    assertThrows(UnsupportedOperationException.class, () -> map.put(4, "four"));
  }
}
