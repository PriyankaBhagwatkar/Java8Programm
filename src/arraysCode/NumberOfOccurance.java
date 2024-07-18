//19) Given the array {10, 1, 20, 2, 100, 100, 100}, write Java code using Java Streams to determine the number of occurrences of a particular value.

package arraysCode;

import java.util.Arrays;

public class NumberOfOccurance {
	public static void main(String[] args) {
		int[] values = {10,23,56,56,56,89};
		int number = 56;
		long result= Arrays.stream(values).filter(value -> value == number).count();
		 System.out.println(result);
		
	}

}
