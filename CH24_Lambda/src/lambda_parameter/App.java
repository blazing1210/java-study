package lambda_parameter;

@FunctionalInterface
interface Runner{
	void execute(String s);
}

public class App {

	public static void main(String[] args) {
		//파라메터(매개변수)가 있는 추상 메서드
		Runner run1=(s)->System.out.println(s);
		run1.execute("펭수");
		
		Runner run2=(s)->System.out.println(s);
		run2.execute("길동");
	}

}
