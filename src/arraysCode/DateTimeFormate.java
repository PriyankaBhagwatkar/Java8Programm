//17) Then format it in dd-MM-yyyy format?
package arraysCode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormate {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd-mm-yyyy");
		System.out.println(dateTimeFormatter.format(localDateTime));
		
	}
	
	
	
	
	

}
