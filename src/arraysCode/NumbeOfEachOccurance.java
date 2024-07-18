
//write Java code using Java Streams to determine the number of occurrences of a each value.
package arraysCode;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumbeOfEachOccurance {
    public static void main(String[] args) {
        int[] values = {23, 34, 23, 45, 56, 56};
        
           // Step 1: Count occurrences of each number
     Map<Integer, Long> frequencyMap = Arrays.stream(values)
                                                        .boxed()  // Convert int to Integer
                                                        .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
                
                // Step 2: Print the frequency of each number
                frequencyMap.forEach((number, count) -> System.out.println(number + ": " + count));
            

    }
}
