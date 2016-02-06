package schoollabapplication;

import java.util.ArrayList;

public class Department {
	private String name;
	private ArrayList<Person> people;

	public Department(String name) {
		this.name = name;
		people = new ArrayList<Person>();
	}

	public double getTotalSalary() {
		double sum = 0;
		for (Person p : people) {
			if (p instanceof Faculty) {
				Faculty f = (Faculty) p;
				sum = sum + f.getSalary();
				} 
			else if (p instanceof Staff) {
				Staff s = (Staff) p;
				sum = sum + s.getSalary();
				}
		}
		return sum;
	}

	public void showAllMembers() {
		
		for(Person p: people){
		Class mem=p.getClass();
		System.out.println("Name: "+p.getName()+"Phone Number:"+
		p.getPhoneNumber()+" Age: "+p.getAge()+
				" Type: "+mem.getSimpleName());
		}
	}

	public void unitsPerFaculty() {
		
		for(Person p:people){
			if(p instanceof Faculty){
				Faculty f=(Faculty)p;
				System.out.println("Name: "+f.getName()+"  Units: "+f.getTotalUnits());
				
			}
		}

	}
	public void displayStudentPerFaulty(Faculty fct) {
		System.out.println("Faculty Name: " + fct.getName());
		ArrayList<Course> courseList;
		Faculty faculty;
		for (Person per : people) {
			// System.out.println("Inside Person");
			if (per instanceof Student) {
				// System.out.println("Inside Student");
				Student std = (Student) per;
				courseList = std.getCourseList();
				for (Course course : courseList) {
					// System.out.println("Inside Course");
					faculty = course.getFaculty();
					if (fct.getName().equals(faculty.getName())) {
						System.out.println("Student Name: " + std.getName());

					}
				}
			}
		}

	}

	public void addPerson(Person obj) {
		people.add(obj);
	}
}