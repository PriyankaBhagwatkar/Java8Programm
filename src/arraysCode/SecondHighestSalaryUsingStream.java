package arraysCode;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestSalaryUsingStream {

	public static void main(String[] args) {
		Employee e1= new Employee("Priyanka", 900000);
Employee e2= new Employee("aditya", 3000000);
Employee e3= new Employee("Random", 90000);


// Create a list of employees 
List<Employee> employees = Arrays.asList(e1,e2,e3);

 // Stream to find the second highest salary
double secondHigestSalary = employees.stream() //Converts the list of employees into a stream.
		.map(Employee::getSalary) //Maps each Employee object to its salary.
		.distinct() //Removes duplicate salaries.
		.sorted(Comparator.reverseOrder()) // Sorts the salaries in descending order.
		.skip(1) //: Skips the first salary (which is the highest).
		.findFirst() //Finds the first salary after skipping (which is the second highest).
		.orElse(null); //If no second highest salary is found, returns null.


System.out.println("second higest salary" + 	secondHigestSalary);
		
		
	}
}
