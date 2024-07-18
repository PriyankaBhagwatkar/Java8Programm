//10) Java 8 program to perform square on list elements and filter numbers greater than 50.

package arraysCode;

import java.util.Arrays;
import java.util.List;

public class SquareAndGreater {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,3,6,7,9,3,5);
		nums.stream().map(num -> num*num).forEach(System.out::println);
		
		nums.stream().map(num -> num*num).filter(num -> num>50).forEach(System.out::println);
		
		
		
	}
}
