
public class User {
	private  int id ;
	private String kullan�c�ad� ;
	private String passaword;
	
	
	
	
	public User(int id, String kullan�c�ad�, String passaword) {
	
		this.id = id;
		this.kullan�c�ad� = kullan�c�ad�;
		this.passaword = passaword;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getKullan�c�ad�() {
		return kullan�c�ad�;
	}




	public void setKullan�c�ad�(String kullan�c�ad�) {
		this.kullan�c�ad� = kullan�c�ad�;
	}




	public String getPassaword() {
		return passaword;
	}




	public void setPassaword(String passaword) {
		this.passaword = passaword;
	}
	
}