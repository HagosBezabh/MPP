package humanresourceapplication;
import java.util.ArrayList;

public class Company {
	private String name;
	private ArrayList<Department> dept;
	public Company(String name){
		this.name=name;
		dept=new ArrayList<Department>();
	}
public void print(){
		System.out.println("In "+name+" The departments are:\n");
		for(Department d: dept){
			d.print();
		}
	}
public void addDepartment(Department d){
	dept.add(d);
}
public double getSalary(){
	double sum=0;
	for(Department d:dept){
		sum=sum+d.getSalary();
			}
	return sum;
		}
}
