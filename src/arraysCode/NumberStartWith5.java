//4) Given a list of integers, find out all the numbers starting with 5 using Stream functions ?

package arraysCode;

import java.util.Arrays;

import java.util.List;



public class NumberStartWith5 {
	public static void main(String[] args) {
		List<Integer> nums=  Arrays.asList(23,34,45,56,67,58);
		nums.stream()
		.filter(num -> num.toString().startsWith("5")).
		/*12.toString().startsWith("5") → false
		//34.toString().startsWith("5") → false
		//45.toString().startsWith("5") → false
		//56.toString().startsWith("5") → true
		//67.toString().startsWith("5") → false
		//58.toString().startsWith("5") → true*/
		forEach(System.out::println);
	}

}
