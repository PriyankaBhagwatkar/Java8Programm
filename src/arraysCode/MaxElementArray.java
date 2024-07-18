//13) Write a Program to find the Maximum element in an array?

package arraysCode;

import java.util.Arrays;

public class MaxElementArray {
	public static void main(String[] args) {
		int [] numbers = {2,4,6,7,8};
		Arrays.stream(numbers).max().ifPresent(System.out::println);
		
	}

}
