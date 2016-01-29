package schoollablamdaexpression;

public class Course {
	private String number;
	private String title;
	private int units;
	private Faculty cFaculty;
	public Course(String number, String title, int units, Faculty cFaculty) {
		this.number = number;
		this.title = title;
		this.units = units;
		this.cFaculty = cFaculty;
	}
	public int getUnits(){
		return units;
	}
	public String getNumber() {
		return number;
	}

	public String getTitle() {
		return title;
	}
	public Faculty getFaculty() {
		return cFaculty;
	}
}
