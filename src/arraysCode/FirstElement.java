
//) Given the list of integers, find the first element of the list using Stream functions ?
package arraysCode;

import java.util.Arrays;
import java.util.List;

public class FirstElement {

	public static void main(String[] args) {
	List<Integer> nums = Arrays.asList(12,34,56,76,67);
	nums.stream().findFirst().ifPresent(System.out::println);
	


}
}
