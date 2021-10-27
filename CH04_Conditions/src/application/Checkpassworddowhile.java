package application;
import java.util.Scanner;
public class Checkpassworddowhile {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		final String USER_PASSWORD="hello";
		String password="";
		do {
			System.out.println("비밀번호 입력:");
			password=scan.nextLine();
		}while(!password.equals(USER_PASSWORD));
		scan.close();
		System.out.println("접속 승인.");
	}
}
