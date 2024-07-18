//2) Given a list of integers, find the total number of elements present in the list using Stream functions ?
package arraysCode;

import java.util.Arrays;
import java.util.List;

public class TotalElement {

	public static void main(String[] args) {
		List<Integer> nums= Arrays.asList(23,45,55,22,67,89);
		System.out.println(nums.stream().count());
	
		
		
	} 
}
