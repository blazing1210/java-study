package application;
import java.util.Scanner;
public class if_example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����� ������?");
		int apples=scan.nextInt();
		System.out.print("�ٳ����� ������?");
		int bananas=scan.nextInt();
		scan.close();
		if(apples>bananas) {
			System.out.println("����� �ٳ������� ����");
		}
		else if(apples==bananas) {
			System.out.println("�ٳ����� ����� ���� ����");
		}
		else{
			System.out.println("�ٳ����� ������� ����");
		}
		System.out.println("���α׷�����");
	}
}
