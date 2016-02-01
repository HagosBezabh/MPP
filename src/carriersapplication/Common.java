package carriersapplication;
//.............................................
public class Common {
	private Ups ups;
	private UsMail mail;
	private Fedex fed;
	public Common(Ups ups, UsMail mail, Fedex fed) {
		this.ups = ups;
		this.mail = mail;
		this.fed = fed;
	}
	//...............
	
	public PackageSendingMechanisms getObject(){
		if(ups.getCost()<=mail.getCost()&&ups.getCost()<=fed.getCost())
			return ups;
		else if(mail.getCost()<ups.getCost()&&mail.getCost()<fed.getCost())
			return mail;
		else
			return fed;
	}
	
}
