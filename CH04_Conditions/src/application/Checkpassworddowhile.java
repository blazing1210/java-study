package application;
import java.util.Scanner;
public class Checkpassworddowhile {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		final String USER_PASSWORD="hello";
		String password="";
		do {
			System.out.println("��й�ȣ �Է�:");
			password=scan.nextLine();
		}while(!password.equals(USER_PASSWORD));
		scan.close();
		System.out.println("���� ����.");
	}
}
