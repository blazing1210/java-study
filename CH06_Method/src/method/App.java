package method;


public class App {

	public static void main(String[] args) {
		Person p1=new Person();
		System.out.println(p1.name);//참조 자료형 String은 NULL값이 초기값
		System.out.println(p1.age);//int는 0이 초기값
		p1.sayHello();//클래스 안에 있는 함수(메소드) 메소드호출
		p1.name="펭수";
		p1.age=7;
		p1.sayHello();
		Person p2=new Person();
		p2.name="길동";
		Person p3=new Person();
		p3.name="라이언";
		p2.sayHello();
		p3.sayHello();
	}

}
