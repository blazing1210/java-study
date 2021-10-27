package abstractClass;

public class App {

	public static void main(String[] args) {
		GameObject[] objs = { new Player(), new Monster()};
		for(GameObject obj : objs) {
			System.out.println(obj);
			obj.describe();
	}
		
}
}
