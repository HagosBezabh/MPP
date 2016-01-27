package extraordertracking;

public class HealthPoint extends AComponent{

	private double points;

	public HealthPoint(double point) {

		this.points = point;
	}

	@Override
	public double getPoints() {
		// TODO Auto-generated method stub
		return points;
	}
}