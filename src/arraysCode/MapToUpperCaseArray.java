
//Map to upper case using steam in array

package arraysCode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapToUpperCaseArray {
public static void main (String[] args) {
String[] words = {"priyanka"};
Arrays.stream(words).map(word -> word.toUpperCase()).forEach(System.out::println);
}

}

