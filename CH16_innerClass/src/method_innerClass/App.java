package method_innerClass;

public class App {
	private static String name;
	
	public App() {
		//기본 생성자
		name="앨리자베스";
	}
	
	public String getName() {
		return name;
	}
	public void run() {
		class Printer{
			public void print() {
				System.out.println(name);
				//내부클래스에서 외부클래스의 변수 사용가능
			}
		}
		new Printer().print();
	}
	public static void main(String[] args) {
		//메소드 안의 클래스
		System.out.println(name);
		
		App app=new App();
		app.run();

		
	}

}
