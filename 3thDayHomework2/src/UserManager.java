
public class UserManager extends User{
		public void add(User user) {
			System.out.println(user.kullan�c�ad� + " Adl� Kullan�c� Sisteme Kay�t Edildi");
		}

		
		
		
		//Birden fazla kullan�c� istiyoruz ve bunun neticesinde altarafta olu�turdu�umuz d�ng� ile 
		//yukar�daki add i�lemini �al��t�r�yoruz
		
		
		
		
		public void addMultiple (User [] users) {
			
			for (User user : users) {
				add(user);
		}
		
		
		
		}





}
