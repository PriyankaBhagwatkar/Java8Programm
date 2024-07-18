package arraysCode;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class FindDuplicateElementInarray {
	public static void main(String[] args) {
		int[] number1 = { 1, 2, 3, 4, 5, 1 };
		//int[] number2= {5,9,3,7,5};
		Set<Integer> temp = new HashSet<>();
		Arrays.stream(number1).filter(num -> !temp.add(num)).forEach(System.out::println);
		
	}
	
		
	}

