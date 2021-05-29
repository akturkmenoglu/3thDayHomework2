
public class User {
	private  int id ;
	private String kullanýcýadý ;
	private String passaword;
	
	
	
	
	public User(int id, String kullanýcýadý, String passaword) {
	
		this.id = id;
		this.kullanýcýadý = kullanýcýadý;
		this.passaword = passaword;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getKullanýcýadý() {
		return kullanýcýadý;
	}




	public void setKullanýcýadý(String kullanýcýadý) {
		this.kullanýcýadý = kullanýcýadý;
	}




	public String getPassaword() {
		return passaword;
	}




	public void setPassaword(String passaword) {
		this.passaword = passaword;
	}
	
}