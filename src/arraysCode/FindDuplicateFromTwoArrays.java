package arraysCode;
import java.sql.Array;
import java.util.*;

public class FindDuplicateFromTwoArrays {
	
	public static void main(String[] args) {
		int[] number1= {1,2,3,4,5};
		int[] number2= {2,8,9,6,7,5,2};
		Set<Integer> Set= new HashSet<>();
		Arrays.stream(number2).forEach(n -> Set.add(n));//.forEach(n -> Set.add(n)) iterates through each element n in the stream and adds it to the Set.
		Arrays.stream(number1).filter(n -> Set.contains(n)).forEach(System.out::println); //.filter(n -> Set.contains(n)): Filters the stream to keep only those elements n for which Set contains n.
	}
}
