package nullpointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//��������, 0���� ����������=>��Ÿ�� ���� �߻�
		//1. 0���� ����������
		try {
			System.out.println(5/0);
		}catch(ArithmeticException e){
			System.out.println("0���� ������ �����ϴ�.");
	}
		//2.��ü�� �ּҰ��� ���϶�!!
		Scanner scanner=null;
		try {
			scanner.nextLine();
			scanner.close();
		}catch(Exception e) {
			System.out.println("��ü�� ���� ���Դϴ�.");
		}
	}
}
