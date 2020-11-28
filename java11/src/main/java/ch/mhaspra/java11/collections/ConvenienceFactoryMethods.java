package ch.mhaspra.java11.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConvenienceFactoryMethods {
  public static void main(String[] args) {
    List<String> list = List.of("one", "two", "three");
    Set<String> set = Set.of("A", "B", "C");
    Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three");
  }
}
