package payrollcalculationapplication;
  import java.util.Date;

public class Order {
	private int orderNo;
	private Date orderDate;
	private double orderAmount;
	public Order(int orderNo, Date orderDate, double orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	public double getAmount(){
		return orderAmount;
	}

}  
