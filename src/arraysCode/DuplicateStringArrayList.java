

//20 how  to find only duplicate element with their count from the string ArrayList in java8
package arraysCode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateStringArrayList {
 public static void main(String[] args) {
	 List<String> words= Arrays.asList("A","B","C","B","S","C");
	 Map<String,Long> map =words.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
	 //Uses Collectors.groupingBy to group elements based on the identity function (s -> s), which means grouping by each individual string (s).
	 //Collectors.counting() inside groupingBy counts occurrences of each string.

	 map.entrySet().stream().filter(m -> m.getValue()>1)
	 //map.entrySet().stream()

//Converts the map into a stream of Map.Entry<String, Long>, where each entry represents a string and its count.
//.filter(entry -> entry.getValue() > 1)
//Filters the stream to keep only those entries where the value (count) is greater than 1, indicating duplicates.
	 .forEach(m->System.out.println(m.getKey() +":" +m.getValue()));
	 
	 
	
}
}
