package application;

public class fors {
	public static void main(String[] args) {
//		for(;;) {
//			System.out.println("무한반복")
//		}
		int sub=0;
		for(int i=0; i<3; i++) {
			System.out.println("i: "+(i+1));
		}
		for(int i=0; i<100; i++) {
			sub=sub+(i+1);
		}
		System.out.println(sub);
		
	}
	
}
