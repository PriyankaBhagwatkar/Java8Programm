//Acsending and decending element in ArrAY using java 8
package arraysCode;

import java.util.Arrays;
import java.util.Comparator;

public class AcendingArrayUsingStream {
	public static void main(String[] args) {
		int[] number = {12,23,45,67,89,65,98,99};
	//Ascending 
		int[] SortedNumber =Arrays.stream(number).sorted().toArray();
	
	System.out.println("Ascending SortedNumber:" +Arrays.toString(SortedNumber));
		
		
		
	}

}
