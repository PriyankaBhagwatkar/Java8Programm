//21) Write a Program to give the sum of the salary of employees.

package arraysCode;

import java.util.ArrayList;
import java.util.List;

public class SumOfEmployee {
    private String name;
    private double salary;
    
    public static void main(String[] args) {
        // Create employees
        Employee employee1 = new Employee("test1", 1000);
        Employee employee2 = new Employee("test2", 1500);
        Employee employee3 = new Employee("test3", 2000);
        
        // Create a list to store employees
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        
        // Calculate and print sum of salaries using streams
        double totalSalary = employees.stream()
                                     .mapToDouble(Employee::getSalary)
                                     .sum();
        
        System.out.println("Total salary: " + totalSalary);
    }
}


