//3) Given a list of integers, find out all the even and odd numbers that exist in the Array using Stream functions ?

package arraysCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddArray {
 public static void main (String[] args) {
	 
	int[] nums = {12, 24, 35, 47, 58, 68};
	Arrays.stream(nums).filter(num -> num%2==0).forEach(System.out::println);
	Arrays.stream(nums).filter(num -> num%2!=0).forEach(System.out::println);

	 
 }
}