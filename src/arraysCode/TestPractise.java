

package arraysCode;

import java.security.Identity;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class TestPractise {
 public static void main (String[] args) {
	String str = "aabbccddeeff";
Character uniqueChar	= str.chars().mapToObj(c -> (char)c).
	collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
	.entrySet().stream().filter(entry -> entry.getValue() ==1).map(Map.Entry::getKey).findFirst().orElse(null);
	
	System.out.println("Unique char: " +uniqueChar);
	
	
	
	
	
			
 }}