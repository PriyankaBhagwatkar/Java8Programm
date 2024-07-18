//14) Write a Java 8 program to concatenate two Streams?

package arraysCode;

import java.util.stream.Collectors;	
import java.util.stream.Stream;

public class ConcatStream {
	public static void main(String[] args) {
	//	Stream<Integer> s1= Stream.of(1,2,3);
	//	Stream<Integer> s2= Stream.of(4,5,6);
	//
	//Stream.concat(s1, s2).forEach(System.out::println);
		
		//concat string
		
		
		Stream<String> s1= Stream.of("Hello");
		
		Stream<String> s2= Stream.of("World");
		
		String con= Stream.concat(s1, s2).collect(Collectors.joining(" "));
		System.out.println(con);
	}

}
