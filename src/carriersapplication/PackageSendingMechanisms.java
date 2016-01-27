package carriersapplication;

public abstract class PackageSendingMechanisms {
	private double pounds;
	private String sender;
	public PackageSendingMechanisms(double pounds,String sender) {
		this.pounds = pounds;
		this.sender=sender;
	}
	public double getPounds(){
		return pounds;
	}
	public  abstract double getCost();
	public abstract String getName();
	public String getSender(){
		return sender;
	}
}
