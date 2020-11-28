package ch.mhaspra.java11.collections;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConvenienceFactoryMethodsTest {
  @Test
  void listIsImmutable(){
    List<String> list = List.of("one", "two", "three");

    assertThrows(UnsupportedOperationException.class, () -> list.add("four"));
  }

  @Test
  void factoryMethodForListDoesNotAllowNull(){
    assertThrows(NullPointerException.class, () -> List.of("one", null));
  }

  @Test
  void setIsImmutable(){
    Set<String> set = Set.of("one", "two", "three");

    assertThrows(UnsupportedOperationException.class, () -> set.add("four"));
  }

  @Test
  void factoryMethodForSetDoesNotAllowNull(){
    assertThrows(NullPointerException.class, () -> Set.of("one", null));
  }

  @Test
  void mapIsImmutable(){
    Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three");

    assertThrows(UnsupportedOperationException.class, () -> map.put(4, "four"));
  }

  @Test
  void factoryMethodForMapDoesNotAllowNull(){
    assertThrows(NullPointerException.class, () -> Map.of("null", null));
    assertThrows(NullPointerException.class, () -> Map.of(null, "null"));
  }
}
