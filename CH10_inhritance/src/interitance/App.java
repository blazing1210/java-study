package interitance;

public class App {

	public static void main(String[] args) {
		Animal ani1=new Animal();
		ani1.eat();
		
		Bird bird1=new Bird();
		bird1.eat(); //상속받은 동물의 메소드
		bird1.fly(); 
	}

}
