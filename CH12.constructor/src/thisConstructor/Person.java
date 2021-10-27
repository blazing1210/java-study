package thisConstructor;

public class Person {
	private String name;
	private int age;

	public Person(){
		this("모름",0);
//		name="알 수 없음";
//		age=0;

	}
	
	public Person(String name) {
		this(name,0);
		

	}
	

	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
