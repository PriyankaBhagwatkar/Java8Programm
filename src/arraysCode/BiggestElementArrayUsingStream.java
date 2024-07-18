
	// Find  biggest Number in Array using java 8
	//smallest number in  array

	package arraysCode;

	import java.util.Arrays;
	import java.util.Comparator;

	public class BiggestElementArrayUsingStream {
		public static void main(String[] args) {
			int[] number = {12,32,43,21,56,89,76};
			
		Integer higestNumber =	Arrays.stream(number) //Converts the array into an IntStream.
				.boxed()//Converts the IntStream to a Stream<Integer> because IntStream does not support sorted(Comparator.reverseOrder()) directly.
				.max(Comparator.naturalOrder()) // Finds the maximum value in the stream using natural ordering.
				//.min(Comparator.naturalOrder()) // Finds the minimum value in the stream using natural ordering.
				.orElse(null); //Returns null if there is no second highest number.

		System.out.println(" Higest Number" +higestNumber);
			
		}

	}



