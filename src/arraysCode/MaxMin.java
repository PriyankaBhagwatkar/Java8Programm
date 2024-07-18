//6) Given a list of integers, find the maximum and minimum value element present in it using Stream functions?

package arraysCode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//Optional: A container object which may or may not contain a non-null value.

public class MaxMin {
	public static void main(String[] args) {
		List<Integer> nums=  Arrays.asList(23,45,55,57,78,90,54);
	Optional<Integer> max = nums.stream().max(Integer::compareTo);//Integer::compareTo is a method reference that compares two Integer objects.
	Optional<Integer> min=  nums.stream().min(Integer::compareTo);
	System.out.println(max.orElse(null));
	System.out.println(min.orElse(null));
	
	}

}
