//7) Given a list of integers, sort all the values present in it using Stream functions?

package arraysCode;

import java.util.Arrays;
import java.util.List;

public class SortedElement {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(12,13,56,76,89,43,56);
		nums.stream().sorted().forEach(System.out::println);
		
		
	}

}
