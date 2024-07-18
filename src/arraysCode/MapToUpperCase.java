//12) How to use map to convert words into Uppercase in Java 8?

package arraysCode;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class MapToUpperCase {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("priyanka Aditya");
		words.stream().map(word -> word.toUpperCase()).forEach(System.out::println);
		
		
	}

}
