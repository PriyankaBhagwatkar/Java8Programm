//8) Given a list of integers, sort all the values present in it in descending order  using Stream functions?

package arraysCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DecendingOrder {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(12,13,56,76,89,43,56);
		nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

}}
 