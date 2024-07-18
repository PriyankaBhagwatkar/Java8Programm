// find the missing number using java 8
package arraysCode;

	import java.util.Arrays;

	public class findMissingNumberUsingStream {
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 4, 5, 6}; // Example array
	        int n = 6; // The number range is from 1 to n

	        // Calculate the expected sum of numbers from 1 to n
	        int expectedSum = n * (n + 1) / 2;

	        // Calculate the actual sum of the numbers in the array
	        int actualSum = Arrays.stream(numbers).sum();

	        // The missing number is the difference between the expected sum and the actual sum
	        int missingNumber = expectedSum - actualSum;

	        System.out.println("Missing number: " + missingNumber);
	    }
	}



