
public class Main {

	public static void main(String[] args) {
	
		
		User ahmet = new User ();
		ahmet.kullan�c�ad� = "ahmettrkmnolu";
		
		
		Instructor engin = new Instructor();
		engin.kullan�c�ad� = "Engin Hoca";
		
		
		Student kuddusi = new Student ();
		kuddusi.kullan�c�ad� = "kdds�trkmnolu";
		
		UserManager userManager = new UserManager();
		userManager.add(new User());
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(kuddusi);
		
		IntructorManager �nstructorManager = new IntructorManager();
		�nstructorManager.add(engin);
		
		
		
		
		
		
		
		
		
		
	}

}
