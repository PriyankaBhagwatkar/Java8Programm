package arraysCode;

import java.util.Arrays;

public class CopyElementArrayUsingStream {
	    public static void main(String[] args) {
	        int[] originalArray = {5, 1, 8, 7, 3, 8, 6}; // Example array with some numbers

	        // Copying the array elements to a new array using streams
	        int[] copiedArray = Arrays.stream(originalArray).toArray();

	        // Printing the copied array
	        System.out.println("Copied array: " + Arrays.toString(copiedArray));
	    }
	}


