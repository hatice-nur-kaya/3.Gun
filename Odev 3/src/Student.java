
public class Student extends User {
	private String course;

	public Student() {
		super();
		
	}

	public Student(int id, String firstName, String lastName, String email) {
		super(id, firstName, lastName, email);
		
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
}
