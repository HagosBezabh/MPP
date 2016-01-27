package payrollcalculationapplication;

public class PayCheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private Employee emp;
	//private DateRange payPeriod;
	public PayCheck(double grossPay, double fica, double state, double local, 
			double medicare, double socialSecurity) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		//this.payPeriod = payPeriod;
	}
	public void print(){
		System.out.println("Gross pay:"+grossPay+" Fica:"+fica+" State:"+state+
				" Local:"+local+" Medicare:"+medicare+" Social Security:"+socialSecurity);
	}
	
	public double getNetPay(){
		
		double net=grossPay-(fica+state+local+medicare+socialSecurity);
		return net;
		
	}

}
