package arraysCode;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacterString {
	public static void main(String[] args) {
		String str = "aabbcddef";

		Map<Character, Long> firstNonRepeatedChar = str.chars().mapToObj(c -> (char) c)// // Convert IntStream to
																						// Stream<Character>
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		List<Character> charCount = firstNonRepeatedChar.entrySet()// Converts the grouped map into a stream of
																	// key-value pairs (characters and their counts).
				.stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println("First non-repeated character: " + charCount);

	}

}
