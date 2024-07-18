//23) How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?

package arraysCode;

/*import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListMapSorted {
	    private String name;
	    private double salary;
	    
	    public static void main(String[] args) {
	        // Create employees
	        Employee employee1 = new Employee("test1", 1000);
	        Employee employee2 = new Employee("test2", 1500);
	        Employee employee3 = new Employee("test3", 2000);
	        Employee employee4 = new Employee("test3", 2000);
	        
	        // Create a list to store employees
	        List<Employee> employees = new ArrayList();
	        employees.add(employee1);
	        employees.add(employee2);
	        employees.add(employee3);
	        employees.add(employee4);
	        
	  Map<String,Double> uniqueEmployee = employees.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary,
	        		(existing,replacement)->existing),()-> new TreeMap<>(Comparator.naturalOrder()));
	        System.out.println(uniqueEmployee);
	        
	    }
	}


*/

/*import java.util.*;
import java.util.stream.*;



public class ConvertListMapSorted {

    public static void main(String[] args) {
        // Create employees
        List<Employee> employees = Arrays.asList(
                new Employee("test1", 1000),
                new Employee("test2", 2000),
                new Employee("test3", 3000),
                new Employee("test1", 4500) // Duplicate key example
        );

        // Convert list to map sorted by employee name
        Map<String, Double> sortedEmployeeMap = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getName, // Key mapper
                        Employee::getSalary, // Value mapper
                        Double::sum, // Merge function for duplicate keys (sum salaries)
                        TreeMap::new // Supplier for TreeMap to maintain order
                ));

        // Print the sorted map
        sortedEmployeeMap.forEach((name, salary) -> System.out.println(name + ": " + salary));
    }
}
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ConvertListMapSorted {

    public static void main(String[] args) {
        // Create employees
        Employee employee1 = new Employee("test1", 1000);
        Employee employee2 = new Employee("test2", 2000);
        Employee employee3 = new Employee("test3", 3000);
        Employee employee4 = new Employee("test1", 4000); // Duplicate key example

        // Create a list to store employees
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        // Convert list to map sorted by employee name
        Map<String, Double> sortedEmployeeMap = employees.stream()
                .collect(
                        TreeMap::new, // Supplier for TreeMap
                        (map, employee) -> map.merge(employee.getName(), employee.getSalary(),
                                (existingSalary, newSalary) -> existingSalary + newSalary), // Merge function for handling duplicate keys
                        TreeMap::putAll // Accumulator function
                );

        // Print the sorted map
        sortedEmployeeMap.forEach((name, salary) -> System.out.println(name + ": " + salary));
    }
}



