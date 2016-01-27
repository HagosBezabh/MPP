package payrollcalculationapplication;

public class Hourly extends Employee{
	private double hourlyWage;
	private int hoursPerMonth;
	public Hourly(String empId,double hourlyWage, int hoursPerMonth) {
		super(empId);
		this.hourlyWage=hourlyWage;
		this.hoursPerMonth=hoursPerMonth;
	}
	public double calcGrossPay(){
		return hourlyWage*hoursPerMonth;
	}
	
}
