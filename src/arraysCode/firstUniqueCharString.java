//Find the first unique character in string using stream

package arraysCode;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstUniqueCharString {
	public static void main(String[] args) {
		String str = "aabbcddef";

		Character firstNonRepeatedChar = str.chars().mapToObj(c -> (char) c)// // Convert IntStream to Stream<Character>
.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, // : Maintains the order of
																						// insertion
Collectors.counting()))
.entrySet()// Converts the grouped map into a stream of key-value pairs (characters and
							// their counts).
.stream().filter(entry -> entry.getValue() == 1)
.map(Map.Entry::getKey)
.findFirst().orElse(null);

		System.out.println("First unique character: " + firstNonRepeatedChar);

	}

}
