package application;
import java.util.Scanner;
public class Scope {

	public static void main(String[] args) {
		//������ ������ �ڵ����{}���� ����
		{
			int value=0;
			System.out.println(value);
		}
//		System.out.println(value); �ڵ���� �ۿ��� ���Ұ�
		for(int i=0;i<4;i++) {
			System.out.println(i);
		}
//		System.out.println(i); ����
		Scanner scan=new Scanner(System.in);
		String input="";
		do {
			System.out.println("�����ҷ���'q'�Է�");
			input= scan.nextLine();
		}while(!input.equals("q"));
		scan.close();
		
	}

}