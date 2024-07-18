
//  find out all the number starting with 5 in array  using Stream functions ?

package arraysCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith5Array {
public static void main (String[] args) {
	 
	//List<Integer> nums= Arrays.asList(23,45,67,55,89,54);
	int[] nums = {12, 24, 35, 47, 58, 68};
	Arrays.stream(nums).filter(num -> Integer.toString(num).startsWith("5")).forEach(System.out::println);
	 
}
}
