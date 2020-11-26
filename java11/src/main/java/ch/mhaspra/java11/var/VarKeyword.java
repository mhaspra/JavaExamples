package ch.mhaspra.java11.var;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BinaryOperator;

public class VarKeyword {
  public static void main(String[] args){
    var aString = "a String";
    var anInt = 1;
    var anInteger = Integer.valueOf(1);

    var listOfStrings = new ArrayList<String>();
    var listOfInts = Arrays.asList(1,2,3);

    //Var in lambda parameters makes the use of final possible
    BinaryOperator<Integer> add = (final var x, final var y) -> x + y;
  }
}
