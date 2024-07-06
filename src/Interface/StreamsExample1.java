package Interface;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class StreamsExample1 {
//    public static void main(String[] args) {
//        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
//
//        // What does the following code snippet do?
//        Map<Integer, List<String>> groupedByLength = fruits.stream()
//                .collect(Collectors.groupingBy(String::length));
//
//        System.out.println("Result: " + groupedByLength);
//    }
    public static void main2(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // What does the following code snippet do?
        Set<String> uniqueFruits = fruits.stream()
                .collect(Collectors.toSet());

        System.out.println("Result: " + uniqueFruits);
    }
    public static void main3(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
//        words.stream().reduce((s, s2) -> { s.length()+s2.length();}).get();
        // What does the following code snippet do?
        boolean allMatch = words.parallelStream()
                .allMatch(w -> w.length() > 3);

        System.out.println("All match: " + allMatch);
    }
    public static void main4(String[] args) {


        IntFunction<Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // Output: ?




        BinaryOperator<Integer> addition = (x, y) -> x + y;
        System.out.println(addition.apply(10, 20)); // Output: ?




        Function<Integer, Integer> increment = x -> x + 1;
        System.out.println(increment.apply(7)); // Output: ?
    }
    public static void main(String[] args) {


        IntFunction<Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // Output: ?




        BinaryOperator<Integer> addition = (x, y) -> x + y;
        System.out.println(addition.apply(10, 20)); // Output: ?




        Function<Integer, Integer> increment = x -> x + 1;
        System.out.println(increment.apply(7)); // Output: ?
    }
}