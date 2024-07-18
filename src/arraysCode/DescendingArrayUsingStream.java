package arraysCode;

import java.util.Arrays;
import java.util.Comparator;

public class DescendingArrayUsingStream {
	public static void main(String[] args) {
		int[] number= {12,34,56,67,89,45};
	int[] SortedNumber=	Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
		System.out.println("descending Number:" +Arrays.toString(SortedNumber));
		
	}

}
