package mult_inheritance;

public class Person implements Greeter,Speaker{
	//인터페이스는 다중 구현가능,상속(extends)은 하나만가능
	@Override
	public void speak() {
		System.out.println("환영합니다.");
		
	}

	@Override
	public void greet() {
		System.out.println("나는 Person입니다.");
		
	}

}
