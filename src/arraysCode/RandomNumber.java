//15) Write a program in stream to print 10 random numbers.

package arraysCode;

import java.util.Random;
import java.util.stream.Stream;

public class RandomNumber {
public static void main(String[] args) {
	Random random = new Random();
	Stream.generate(random::nextInt).limit(10).forEach(System.out::println);
	
	
}
}
