//Duplicate Element with their count

package arraysCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.stream.Collectors;


public class DuplicateArrayString {
public static void main (String[] args) {
	String[] words={"a","b","c","a"};
	Map<String, Long> map = Arrays.stream(words).collect(Collectors.groupingBy(s -> s,Collectors.counting()));
	map.entrySet().stream().filter(m -> m.getValue()>1)
	.forEach(m->System.out.println(m.getKey()+":" +m.getValue()));
	
	 
	 
	

}}
