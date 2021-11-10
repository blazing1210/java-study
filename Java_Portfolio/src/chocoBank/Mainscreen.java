package chocoBank;

public class Mainscreen {

	public static void main(String[] args) {
		
		
		Account account=new Account();
		Bankrun bankrun=new Bankrun(account);
		
		account.adduser("kim","1234",450000);
		account.adduser("park","1234",1000000);
		account.adduser("cho","1234",400000);
		account.adduser("hong","1234",500000);
		account.adduser("james","1234",1500000);
		
		
		
		bankrun.mainScreen();
	}

}
