package carriersapplication;

public class UsMail extends PackageSendingMechanisms{

	public UsMail(double pounds,String sender) {
		super(pounds,sender);
		
	}
	public double getCost(){
		if(getPounds()<=3.0&&getSender().equals("student"))
			return 0.9;
		else if(getPounds()<=3.0&&getSender().equals("senior"))
			return 0.85;
		else if(getPounds()>3.0&&getSender().equals("student"))
			return 0.45*getPounds();
		else if(getPounds()>3.0&&getSender().equals("senior"))
			return 0.40*getPounds();
		else 
			return 0.55*getPounds();
		
	}
	public String getName(){
		return "UsMail";
	}
}
