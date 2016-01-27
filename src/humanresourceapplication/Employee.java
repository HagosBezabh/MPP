package humanresourceapplication;
import java.util.Date;

public class Employee {
	private String employeeId;
	private String fName;
	private String middleInitial;
	private String lastName;
	private Date BirthDate;
	private String ssn;
	private double salary;
	//private Position position;
	public Employee(String employeeId, String fName, String middleInitial, String lastName,
		Date birthDate, String ssn, double salary) {
		this.employeeId = employeeId;
		this.fName = fName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		BirthDate = birthDate;
		this.ssn = ssn;
		this.salary = salary;
		
			}
public void print(){
		System.out.println("\t\t\t\tEmployee name:"+ fName+" "+ middleInitial+" "+ lastName);
		}
public double getSalary(){
	return salary;
		}
	
}
