package application;
import java.util.Scanner;
public class if_example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("사과의 갯수는?");
		int apples=scan.nextInt();
		System.out.print("바나나의 갯수는?");
		int bananas=scan.nextInt();
		scan.close();
		if(apples>bananas) {
			System.out.println("사과가 바나나보다 많음");
		}
		else if(apples==bananas) {
			System.out.println("바나나와 사과의 수가 같음");
		}
		else{
			System.out.println("바나나가 사과보다 많음");
		}
		System.out.println("프로그램종료");
	}
}
