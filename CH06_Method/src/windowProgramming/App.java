package windowProgramming;

public class App {

	public static void main(String[] args) {
		Window win=new Window();
		win.setwidth(400);
		win.setinvisible(true);
		
		System.out.println("â�� ���α���: "+win.getwidth());
		System.out.println("���̴°�? "+win.getinvisible());

	}

}
