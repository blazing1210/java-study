package application;
import java.util.Scanner;
public class Ex1 {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("�޴�\n====\n");
			System.out.println("1. ����Ʈ '��ο�'\n2.����Ʈ '�ȳ� ?'\n3. ���α׷�����\n ");
			System.out.print("�ɼ��� ����> ");
			int result=scan.nextInt();
			scan.close();
//			if(result==1) {
//				System.out.println("��ο�");
//			}
//			else if(result==2) {
//				System.out.println("�ȳ�");
//			}
//			else if(result==3) {
//				System.out.println("�����մϴ�...");
//			}
//			else if(result==10000) {
//				System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�");
//			}
//			else {
//				System.out.println("�߸��� �ɼ��Դϴ�.");
//			}
			switch (result) {
			case 1:
				System.out.println("��ο�");
				break;
			case 2:
				System.out.println("�ȳ�");
				break;
			case 3:
				System.out.println("�����մϴ�...");
				break;
			case 10000:
				System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�.");
				break;
			default:
				System.out.println("�߸��� �ɼ��Դϴ�.");
				break;
			}
			
			}
	}
