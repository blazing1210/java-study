package application;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		//�Է��� �н����尡 ������ �н������ ������ ��
		final String USER_PASSWORD="hello";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��й�ȣ �Է� : ");
		String password=scan.nextLine();
		scan.close();
		if(password.equals(USER_PASSWORD)) {
			System.out.println("���� ����.");
		}
		else{	
			System.out.println("���� ����.");
		}
		

	}

}
