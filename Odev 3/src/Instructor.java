
public class Instructor extends User {
private String branch;
	
	
	public Instructor() {
		super();
		
	}
	public Instructor(int id, String firstName, String lastName, String email,  String branch) {
		super(id, firstName, lastName, email);
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	


}
