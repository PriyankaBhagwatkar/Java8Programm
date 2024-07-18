//5) How to find duplicate elements in a given integers list in java using Stream functions?
package arraysCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
	public static void main(String[] args) {
		List<Integer> nums=  Arrays.asList(23,45,55,57,78,90,54,54,55);
		Set<Integer> temp = new HashSet(); //Creates a HashSet named temp to store unique elements.HashSet does not allow duplicate elements, so when you try to add a duplicate element, it returns false.
		nums.stream().filter(num -> !temp.add(num))
		//1:-> If add(num) returns false, it means num is already in the HashSet (temp), indicating a duplicate.
		//2:-> temp.add(num) attempts to add num to temp.
		//3:-> !temp.add(num) evaluates to true if num is already present in temp (i.e., it's a duplicate), 
		//because add returns false when the element is already in the set.
		.forEach(System.out::println);
		
	}
}
