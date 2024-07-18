package arraysCode;

import java.util.Arrays;

public class SumOfArrayUsingStream {
	    public static void main(String[] args) {
	        int[] numbers = {5, 1, 8, 7, 3, 8, 6}; // Example array with some numbers

	        // Calculating the sum of the array elements using streams
	        int sum = Arrays.stream(numbers).sum();

	        // Printing the sum of the array elements
	        System.out.println("Sum of array elements: " + sum);
	    }
	}


