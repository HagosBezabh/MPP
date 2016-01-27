package humanresourceapplication;
import java.util.ArrayList;

public class Position {
	private String title;
	private String des;
	private Employee emp;
	private Position superior;
	private ArrayList<Position> inferior;
	public Position(String title, String des, Employee emp) {
		this.title = title;
		this.des = des;
		this.emp = emp;
		inferior =new ArrayList<Position>();
	}
	public void print(){
		System.out.println("\t\tPosition: " + title );
		  emp.print();
	}
	public double getSalary(){
		return emp.getSalary();
	}
	public void printDownLine(){
		
	}
	public void addInferior(Position p){
		inferior.add(p);
	}
	public boolean isManager(){
		return true;
	}
	public void setSuperior(Position p){
		this.superior=p;
	}
}
