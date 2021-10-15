package windowProgramming;

public class App {

	public static void main(String[] args) {
		Window win=new Window();
		win.setwidth(400);
		win.setinvisible(true);
		
		System.out.println("창의 가로길이: "+win.getwidth());
		System.out.println("보이는가? "+win.getinvisible());

	}

}
