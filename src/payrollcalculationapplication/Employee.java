package payrollcalculationapplication;
import java.util.ArrayList;

public abstract class Employee {
	private String empId;
	private ArrayList<PayCheck> check;
	public Employee(String empId){
		this.empId=empId;
		check = new ArrayList<PayCheck>();
	}
	public void addPayCheck(PayCheck e){
		check.add(e);
	}
	public void print(){
		for(PayCheck p: check){
			p.print();
		}
	}
	public PayCheck calcCompensation(){
		//return null;
		
		double grossPay=calcGrossPay();
		double fica = grossPay*0.23;
		double state=grossPay*0.05;
		double local=grossPay*0.01;
		double medicare=grossPay*0.03;
		double socialSecurity=grossPay*.075;
		PayCheck check = new PayCheck(grossPay,fica,state,local,medicare,socialSecurity);
		return check;
		
		
	}
	public abstract double calcGrossPay();
		
}
