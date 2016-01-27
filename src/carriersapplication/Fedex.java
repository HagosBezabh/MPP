package carriersapplication;

public class Fedex extends PackageSendingMechanisms{
	private String zone;
	public Fedex(double pounds, String zone,String sender){
		super(pounds,sender);
		this.zone=zone;
	}
	public double getCost(){
		if(zone.equals("IA")||zone.equals("MT")||zone.equals("OR")
				||zone.equals("CA"))
		{
			if(getSender().equals("student"))
			return (0.35-0.1)*getPounds();
			else if(getSender().equals("seniors"))
				return  (0.35-.15)*getPounds();
			else
				return 0.35*getPounds();
		}
		else if(zone.equals("TX")||zone.equals("UT")){
			if(getSender().equals("student"))
				return (0.30-0.1)*getPounds();
				else if(getSender().equals("seniors"))
					return  (0.30-.15)*getPounds();
				else
					return 0.30*getPounds();

			//return 0.30*getPounds();
		}
		else if(zone.equals("FL")||zone.equals("MA")||zone.equals("OH"))
		{
			if(getSender().equals("student"))
				return (0.55-0.1)*getPounds();
				else if(getSender().equals("seniors"))
					return  (0.55-.15)*getPounds();
				else
					return 0.55*getPounds();

		}
		else
		{
			if(getSender().equals("student"))
				return (0.43-0.1)*getPounds();
				else if(getSender().equals("seniors"))
					return  (0.43-.15)*getPounds();
				else
					return 0.43*getPounds();

		}
			
	}
	public String getName(){
		return "Fedex";
	}
}
