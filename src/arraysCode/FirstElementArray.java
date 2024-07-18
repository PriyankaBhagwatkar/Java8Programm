//find the first element in array using java 8
package arraysCode;
import java.util.Arrays;
import java.util.OptionalInt;

public class FirstElementArray {
    public static void main(String[] args) {
        int[] number = {12, 24, 35, 47, 58, 68};

        // Convert int[] to IntStream and find the first element
        OptionalInt firstElement = Arrays.stream(number).findFirst();

        // Print the first element if present
        if (firstElement.isPresent()) {
           System.out.println("First element in array: " + firstElement.getAsInt());
       } else {
            System.out.println("Array is empty");
        }
    }
}

