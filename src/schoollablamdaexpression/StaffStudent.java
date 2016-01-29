package schoollablamdaexpression;

import java.util.ArrayList;
import java.util.Date;

public class StaffStudent extends Staff {
	private Date date;
	private Student std;
	public StaffStudent(String name, String phone, int age, double salary, Date date,Student std) {
		super(name,phone,age,salary);
		this.std=std;
		this.date= date;
	}
	/*public void startingDate(){
		for(Course c: course){
		System.out.println("First course started: "+ date.getMonth()+","+","+date.getDate()+","+date.getYear());
		break;
	}
	}*/
	public double getGpa() {
		return std.getGpa();
	}
	public ArrayList<Course> getCourses(){
		return std.getCourseList();
	} 
	public int getTotalUnits() {

		return std.getTotalUnits();
	}

	public void addCourse(Course course) {
		std.addCourse(course);
	}

	public void setStartFirstCourse(Date start) {
		this.date = start;
	}

	public Date getStartDate() {
		return date;
	}
	 

}
