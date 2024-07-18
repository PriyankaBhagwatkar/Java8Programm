//Find Second highest number in array using Stream
package arraysCode;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumberUsingStream {
	public static void main(String[] args) {
		int[] number = {12,32,43,21,56,89,76};
		
	Integer higestNumber =	Arrays.stream(number) //Converts the array into an IntStream.
			.boxed()//Converts the IntStream to a Stream<Integer> because IntStream does not support sorted(Comparator.reverseOrder()) directly.
			.distinct()  // Removes duplicate numbers.
			.sorted(Comparator.reverseOrder())//Sorts the numbers in descending order.
			.skip(1) //: Skips the first element (the highest number).
			.findFirst() // Finds the next element (the second highest number).
			.orElse(null); //Returns null if there is no second highest number.

	System.out.println("Second Higest Number" +higestNumber);
		
	}

}
