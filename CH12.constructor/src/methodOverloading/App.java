package methodOverloading;

public class App {

	public static void main(String[] args) {
		Person person=new Person();
		person.greet();
		person.greet("Æë¼ö");
		person.greet(190);
		person.greet("Æë¼ö",190);
		

	}

}
