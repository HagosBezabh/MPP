package schoollablamdaexpression;
import java.util.ArrayList;
public class Faculty extends Person {
	private double salary;
	private ArrayList<Course> fCourse;
	public Faculty(String name,String phone,int age, double salary){
		super(name, phone,age);
		this.salary=salary;
		fCourse=new ArrayList<Course>();
		//fCourse= new 
	}
	public void addCourse(Course obj){
		fCourse.add(obj);
	}
	
	public int getTotalUnits(){
		int unit=0;
		for(Course c: fCourse){
			unit=unit+c.getUnits();
		}
		return unit;
	}
	public double getSalary(){
		return salary;
	}
	public void displayFacultyStudents(){
		System.out.println("Name: " + getName());
	}

}
