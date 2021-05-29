
public class UserManager extends User{
		public void add(User user) {
			System.out.println(user.kullanýcýadý + " Adlý Kullanýcý Sisteme Kayýt Edildi");
		}

		
		
		
		//Birden fazla kullanýcý istiyoruz ve bunun neticesinde altarafta oluþturduðumuz döngü ile 
		//yukarýdaki add iþlemini çalýþtýrýyoruz
		
		
		
		
		public void addMultiple (User [] users) {
			
			for (User user : users) {
				add(user);
		}
		
		
		
		}





}
