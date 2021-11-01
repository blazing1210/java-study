package equals;

class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
	@Override
	public boolean equals(Object other) {
		// Object클래스의 equals 오버라이드해서 Person클래스의 이름으로 비교하도록 수정
		String a="abc";
		String b="def";
		a.equals(b);
		
		if(other==null)	return false;//널값이면 false
		if(other==this) return true;//같은 객체면 true
		if(!(other instanceof Person)) return false;//같은 타입이 아니면 false
		if(this.name==null) return false;//this객체의 이름값이 널이면 false
		Person p=(Person)other;//다운캐스팅 타입변환
		if(p.name==null)return false;
		
		return this.name.equals(p.name);//other객체의 이름값이 널이면 false
	}
	
}

public class App {

	public static void main(String[] args) {
		Person p1=new Person("펭수");
		Person p2=new Person("라이언");
		
		System.out.println(p1==p2);//객체의 주소를비교
		System.out.println(p1.equals(p2));

	}

}
