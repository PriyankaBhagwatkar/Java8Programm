//11) Write a Java 8 program to sort an array and then convert the sorted array into Stream?


package arraysCode;

import java.util.Arrays;

public class SortArrayConvertToStream {
	public static void main(String[] args) {
		int[] numbers = {11,2,34,42,5};
		Arrays.sort(numbers);;
		Arrays.stream(numbers).forEach(System.out::println);
	}

}
