//3) Given a list of integers, find out all the even and odd numbers that exist in the list using Stream functions ?

package arraysCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class IndirectEvenOdd{
 public static void main (String[] args) {
	 
	 List<Integer> nums =Arrays.asList(12,34,45,67,43,22,86);
List<Integer> evenNumber =nums.stream().filter(num -> num%2==0).collect(Collectors.toList());
System.out.println("Even Number" +evenNumber);
	 
	 
List<Integer> oddNumber =nums.stream().filter(num -> num%2!=0).collect(Collectors.toList());
System.out.println("Even Number" +oddNumber);
	 
 }
}