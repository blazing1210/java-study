package object_class;

public class AccountTest {

	public static void main(String[] args) {
		Account a= new Account("123-45",10000);
		Account b= new Account("567-89",10000);
		
		boolean result =true;
		while(result) {
			result=a.transfer(b,3000);
		}
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		

	}

}
class Account{
	String num;
	int balance;
	public Account(String str, int i) {
		num=str;
		balance=i;
	}
	
	public String toString() {
		return String.format("Accounnt{num:%s,balance:%d}",num,balance);
	}
	public boolean transfer(Account target,int amount){
		if(balance<amount){
			return false;
		}
		
		balance-=amount;
		target.balance+=amount;
		return true;
	}
	
	
}