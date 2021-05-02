
public class Main {

	public static void main(String[] args) {
		User user1= new User();
		user1.setId(1);
		user1.setFirstName("Hatice Nur");
		user1.setLastName("Kaya");
		user1.setEmail("haticenur@");
	
		

		Student student1=new Student();
		student1.setId(1);
		student1.setFirstName("Hatice Nur");
		student1.setLastName("Kaya");
		student1.setEmail("haticenur@");
		student1.setCourse("Java and React");
		
		Instructor instructor1=new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engiin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("a");
		instructor1.setBranch("Java and React");
		
		UserManager userManager =new UserManager();
		userManager.add();
	     
		   
	}
}
