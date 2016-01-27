package schoollabapplication;
import java.util.ArrayList;
public class Student extends Person  {
	private double gpa;
	private ArrayList<Course> sCourse;
	public Student(String name,String phone,int age, double gpa){
		super(name, phone,age);
		this.gpa=gpa;
	}
	public void addCourse(Course obj){
		sCourse.add(obj);
	}
	
	
	public int getTotalUnits(){
		int units=0;
		for(Course c: sCourse){
			units= units+c.getUnits();
		}
		return units;
	}
	public ArrayList<Course> getCourseList(){
		return sCourse;
	}
	public double getGpa(){
		return gpa;
	}
	
}
