package payrollcalculationapplication;
import java.util.ArrayList;

public class Commissioned extends Employee {
	private double comission;
	private double baseSalary;
	private ArrayList<Order> orders;
	public Commissioned(String empId, double commission, double salary) {
		super(empId);
		this.comission=commission;
		this.baseSalary=salary;
		orders=new ArrayList<Order>();
	}
	public void addOrder(Order e){
		orders.add(e);
	}
	public double calcGrossPay(){
		double amount=0;
		for(Order e: orders){
			amount = amount +e.getAmount();
		}
		
		return (comission*amount)+baseSalary;
	}
	
}
