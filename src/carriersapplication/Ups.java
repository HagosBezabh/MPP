package carriersapplication;

public class Ups extends PackageSendingMechanisms  {
	
	public Ups(double pounds,String sender) {
		super(pounds,sender);
	}
	public double getCost(){
		if(getSender().equals("student")){
		return .35*getPounds();
		}
		else if(getSender().equals("senior"))
			return 0.3*getPounds();
		else
			return 0.45*getPounds();
	}
	
	public String getName(){
		return "Ups";
	}
	
}
