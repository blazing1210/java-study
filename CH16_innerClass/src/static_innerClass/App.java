package static_innerClass;

public class App {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.Print();
		//이너클래스(객체를 만들때도 먼저 외부클래스 객체를 만들고 만들 수있다(Person클래스))
		Person.Head head=p1.new Head();
		head.print();
		//스태틱 이너 클래스 외부객체에서 바로.Body();
		Person.Body body=new Person.Body();
		body.print();

	}

}
