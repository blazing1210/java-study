package parameter;

public class App {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		
		int number=7;
		int result=calc.square(number);
		System.out.printf("%d의 제곱은 %d 이다.",number,result);
		
		result =calc.plus(10,10);
		System.out.printf("두 수의 합은 %d 이다.",result);
		
		result =calc.minus(10,10);
		System.out.printf("두 수의 차은 %d 이다.",result);
	}

}
