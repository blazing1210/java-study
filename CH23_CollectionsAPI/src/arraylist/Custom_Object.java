package arraylist;

import java.util.ArrayList;

public class Custom_Object {

	public static void main(String[] args) {
		//리스트에 커스텀객체 입력
		//people리스트에는 Person 타입객체가 입력된다.
		ArrayList<Person> people=new ArrayList<>();
		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));
		
		people.forEach(System.out::println );
		
		people.set(1,new Person("마이클"));
		
		people.forEach(System.out::println );
	}

}
