package ch.mhaspra.java11.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class StreamApiImprovements {
  public static void main(String[] args) {
    System.out.println("takeWhile: " + IntStream.iterate(0, n -> n + 1)
        .takeWhile(n -> n < 5)
        .mapToObj(Integer::toString)
        .collect(joining(", ")));

    System.out.println("dropWhile: " + IntStream.range(0, 10)
        .dropWhile(n -> n < 5)
        .mapToObj(Integer::toString)
        .collect(joining(", ")));

    System.out.println("3-arg iterate: " + IntStream.iterate(0, n -> n < 5, n -> n + 1)
        .mapToObj(Integer::toString)
        .collect(joining(", ")));

    Map<Integer, Integer> oddIntegers = Map.of(1, 1, 3, 3, 5, 5);
    List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
    System.out.println("ofNullable: " + integers.stream()
    .flatMap(n -> Stream.ofNullable(oddIntegers.get(n)))
        .map(String::valueOf)
    .collect(joining(", ")));
  }
}
