package refrences;

public class App {

	public static void main(String[] args) {
		//레퍼런스(참조,주소값) 변수
		Person p1=new Person(); //p1은 객체가 생성된 위치 즉 주소값을 가진다.
		System.out.println(p1);
		Person p2= p1;
		System.out.println(p2);
		Person p3=new Person();
		System.out.println(p3);
		
		test(p2);
	}

private static void test(Person person) {
	System.out.println(person);
}	
}
