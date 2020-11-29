# Differences between Java 11 (LTS) and Java 8 (LTS)
## Convenience Factory Methods for Collections
There are convenience factory methods for [Lists, Sets and Maps](src/main/java/ch/mhaspra/java11/collections/ConvenienceFactoryMethods.java).
* They do not [allow null values, and the created collections are immutable](src/test/java/ch/mhaspra/java11/collections/ConvenienceFactoryMethodsTest.java).
* For up to 10 elements there are explicit methods and for more there is a vararg method which is slightly less performant because of varargs implicit array creation.
* The instances are value based, that means that the factory method is free to return the exact same instance for the same call.

## Stream API Improvements
There are 4 new methods for the stream api [takeWhile, dropWhile, iterate with predicate and ofNullable](src/main/java/ch/mhaspra/java11/streams/StreamApiImprovements.java).

## Optional
There are 4 new methods for the Optional class [ifPresentOrElse, or, stream](src/main/java/ch/mhaspra/java11/optionals/Optionals.java) and [orElseThrow](src/test/java/ch/mhaspra/java11/optionals/OptionalsTest.java).