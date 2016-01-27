package extraordertracking;

public class PersonalCustomer extends ACustomer {

	private String creditRating;
	private String creditNumber;

	PersonalCustomer(String name, String address, String phone, double point, String creditRating,
			String creditNumber) {
		super(name, address, phone, point);
		// TODO Auto-generated constructor stub
		this.creditRating = creditRating;
		this.creditNumber = creditNumber;
	}

	@Override
	public String getCretitRating() {
		// TODO Auto-generated method stub
		return creditRating;
	}

}