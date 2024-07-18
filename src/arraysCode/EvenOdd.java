//3) Given a list of integers, find out all the even and odd numbers that exist in the list using Stream functions ?

package arraysCode;

import java.util.Arrays;
import java.util.List;

public class EvenOdd {
 public static void main (String[] args) {
	  List<Integer> nums = Arrays.asList(76,22,45,12,80,57,34);
	  nums.stream().filter(num -> num%2==0).forEach(System.out::println);
	  nums.stream().filter(num -> num%2!=0).forEach(System.out::println);
	  
 }
}
