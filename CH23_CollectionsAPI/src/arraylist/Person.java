package arraylist;

public class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Person o) {
		// 비교할 내용을 직접 만든다
		return name.compareTo(o.name);
	}
}
