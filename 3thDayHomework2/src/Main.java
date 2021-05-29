
public class Main {

	public static void main(String[] args) {
	
		
		User ahmet = new User ();
		ahmet.kullanıcıadı = "ahmettrkmnolu";
		
		
		Instructor engin = new Instructor();
		engin.kullanıcıadı = "Engin Hoca";
		
		
		Student kuddusi = new Student ();
		kuddusi.kullanıcıadı = "kddsıtrkmnolu";
		
		UserManager userManager = new UserManager();
		userManager.add(new User());
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(kuddusi);
		
		IntructorManager ınstructorManager = new IntructorManager();
		ınstructorManager.add(engin);
		
		
		
		
		
		
		
		
		
		
	}

}
