package humanresourceapplication;
import java.util.ArrayList;

public class Department {
	private String name;
	private String location;
	private Company comp;
	private ArrayList<Position> position;

	public Department(String name, String location, Company comp) {
		this.name = name;
		this.location = location;
		this.comp = comp;
		position = new ArrayList<Position>();

	}

	public void print() {
		System.out.println("\tDepartment " + name + ": Positions are");
		for (Position p : position) {
			p.print();
		}
	}

	public void addPosition(Position obj) {
		position.add(obj);
	}

	public double getSalary() {
		double sum = 0;
		for (Position p : position) {
			sum = sum + p.getSalary();
		}
		return sum;
	}

	public void printReportingHierarchy() {

	}
	
	

}
