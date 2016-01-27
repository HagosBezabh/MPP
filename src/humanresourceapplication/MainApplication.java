package humanresourceapplication;
import java.util.Date;

public class MainApplication {

	public static void main(String[] args) {
		Company com = new Company("Microsoft");
		
		Department dept1= new Department("Finance", "Seattle", com);
		Department dept2= new Department("Software Development", "Seattle", com);
		com.addDepartment(dept1);
		com.addDepartment(dept2);
		
		
		//Position position;
		Employee emp1=new Employee("983456", "Jhon", "B. ", "Joseph",new Date(1970, 11, 16),
				"1243-124", 9000);
		Employee emp2=new Employee("983457", "Maria", "O. ", "Carsen",new Date(1978, 06, 4),
				"1243-124", 9000);
		Employee emp3=new Employee("983458", "Haben", "H. ", "hayelom",new Date(1989, 12, 26),
				"1243-124", 9000);
		
		Position pos1= new Position("Accountant I","officer", emp1);
		Position pos2= new Position("Programmer 1","Java developer", emp1);
		Position pos3= new Position("Programmer 1","Java developer", emp1);
		dept1.addPosition(pos1);
		dept2.addPosition(pos2);
		dept2.addPosition(pos3);
		com.print();

	}

}
