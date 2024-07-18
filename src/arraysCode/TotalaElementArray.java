
//2) Given a list of integers, find the total number of elements present in the Array using Stream functions ?
package arraysCode;

import java.util.Arrays;


public class TotalaElementArray {

	public static void main(String[] args) {
	//	List<Integer> nums= Arrays.asList(23,45,55,22,67,89);
		int[] nums = {12, 24, 35, 47, 58, 68};
		
     System.out.println(Arrays.stream(nums).count());
	} 
}
