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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((people == null) ? 0 : people.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (people == null) {
			if (other.people != null)
				return false;
		} else if (!people.equals(other.people))
			return false;
		return true;
	}

	public void addPerson(Person obj) {
		people.add(obj);
	}
}