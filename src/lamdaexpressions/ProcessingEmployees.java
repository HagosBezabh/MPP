package lamdaexpressions;

//Program 4: ProcessingEmployees.java
//Processing streams of Employee objects.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProcessingEmployees
{
public static void main(String[] args)
{
 // initialize array of Employees
 Employee[] employees = {
    new Employee("Jason", "Red", 5000, "IT"),
    new Employee("Ashley", "Green", 7600, "IT"),
    new Employee("Matthew", "Indigo", 3587.5, "Sales"),
    new Employee("James", "Indigo", 4700.77, "Marketing"),
    new Employee("Luke", "Indigo", 6200, "IT"),
    new Employee("Jason", "Blue", 3200, "Sales"),
    new Employee("Wendy", "Brown", 4236.4, "Marketing")};

 // get List view of the Employees
 List<Employee> list = Arrays.asList(employees);
//Question no 2a1
 System.out.printf("Employee whose last name start with B :%s%n",
    Arrays.stream(employees)
    	  .filter(e->e.getLastName().startsWith("B"))
    	  .count()
    	  );
 //Question no 2a2
 
 Predicate<Employee> lastNameStartsB = 
	      e -> (e.getLastName().startsWith("B"));
	      

	     System.out.printf("Employee whose last name start with B in sorted order:%n");
		    list.stream()
		    	  .filter(lastNameStartsB)
		    	  .sorted(Comparator.comparing(Employee::getLastName))
		    	  .forEach(System.out::println);
 //Question no 2a3
		    System.out.printf("Employee whose last name start with B"
		    		+ " in upper case :%n");
		    list.stream()
		    	  .filter(lastNameStartsB)
		    	  .map(e->e.getFirstName().toUpperCase()+" "+e.getLastName())
		    	  .sorted()
		    	  .forEach(System.out::println);
	    
//Question no 2a4
	      System.out.printf("All Employee whose last name start with B"
		    		+ " in upper case :%n");
		    list.stream()
		    	  .filter(e->e.getLastName().startsWith("B"))
		    	  .map(e->new Employee(e.getFirstName(),e.getLastName().toUpperCase(),
				    	  e.getSalary(),e.getDepartment()))
		    	  .forEach(System.out::println);  
		    list.stream()
	    	  .filter(e->!e.getLastName().startsWith("B"))
	    	  .map(e->new Employee(e.getFirstName(),e.getLastName(),
			    	  e.getSalary(),e.getDepartment()))
	    	  /*.map(e->{  if(!e.getLastName().startsWith("B"))
	    		 e=new Employee(e.getFirstName(),e.getLastName().toUpperCase(),
					    	 e.getSalary(),e.getDepartment());
	    	 else
	    		 e=new Employee(e.getFirstName(),e.getLastName().toUpperCase(),
				    	 e.getSalary(),e.getDepartment());
	    	  })*/
	    	  .forEach(System.out::println);
 //Question no 2a5
		   

		    Predicate<Employee> lastNameStartsI = 
		  	      e -> (e.getLastName().startsWith("I"));
		  	      
		 
		  	     System.out.printf("Employee whose last name start with B in sorted order:%n");
		  		    list.stream()
		  		    	  .filter(lastNameStartsI)
		  		    	  .sorted(Comparator.comparing(Employee::getLastName))
		  		    	  .distinct()
		  		    	  .forEach(System.out::println);
//Question no 2a6
		  		  System.out.printf(
		  			      "%nSum of Employees' salaries : %.2f%n",
		  			      list.stream()
		  			          .mapToDouble(Employee::getSalary)
		  			          .sum());
//Question no 2a7
		  		System.out.printf(
		  		      "Sum of Employees' salaries (via reduce method): %.2f%n",
		  		      list.stream()
		  		          .mapToDouble(Employee::getSalary)
		  		          .reduce(0, (value1, value2) -> value1 + value2)); 
//Question no 2a8
		  		 System.out.printf("First names of all Employees:%n");
		  		    list.stream()
		  		    	  .map(e->e.getFirstName())
		  		    	  .forEach(System.out::println);
//Question no 2a9
		  		  System.out.println(
			  		      "Sum of Employees' salaries (via reduce method):%n");
			  		      double amount=list.stream()
			  		          .mapToDouble(Employee::getSalary)
			  		          .reduce(0, (value1, value2) -> value1 + value2);
			  		      System.out.println(amount);
//Question no 2a10
			  		    System.out.println("Creating infinite even nos and printing the first 20");
			  		    IntStream.iterate(0, i -> i + 2)
			  	        .limit(20)
			  	        .forEach(System.out::println);
			  		          
} // end main
} // end class ProcessingEmployees