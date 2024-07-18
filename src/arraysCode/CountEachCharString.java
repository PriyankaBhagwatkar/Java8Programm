package arraysCode;

//22) Write a program to print the count of each character in a String using streams.
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharString {
    public static void main(String[] args) {
        String val = "Priyanka";
        
        // Count occurrences of each character using streams
        Map<Character, Long> charCount = val.chars()
                                           .mapToObj(c -> (char) c)
                                           .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        // Print the count of each character
       System.out.println(charCount);
       
      // charCount.forEach((character, count) -> System.out.println(character + ": " + count));
    }

    }

