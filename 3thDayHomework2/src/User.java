
public class User {
	private  int id ;
	private String kullanıcıadı ;
	private String passaword;
	
	
	
	
	public User(int id, String kullanıcıadı, String passaword) {
	
		this.id = id;
		this.kullanıcıadı = kullanıcıadı;
		this.passaword = passaword;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getKullanıcıadı() {
		return kullanıcıadı;
	}




	public void setKullanıcıadı(String kullanıcıadı) {
		this.kullanıcıadı = kullanıcıadı;
	}




	public String getPassaword() {
		return passaword;
	}




	public void setPassaword(String passaword) {
		this.passaword = passaword;
	}
	
}