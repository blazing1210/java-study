package application;
import java.util.Scanner;
public class Ex1 {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("메뉴\n====\n");
			System.out.println("1. 프린트 '헬로우'\n2.프린트 '안녕 ?'\n3. 프로그램종료\n ");
			System.out.print("옵션을 선택> ");
			int result=scan.nextInt();
			scan.close();
//			if(result==1) {
//				System.out.println("헬로우");
//			}
//			else if(result==2) {
//				System.out.println("안녕");
//			}
//			else if(result==3) {
//				System.out.println("종료합니다...");
//			}
//			else if(result==10000) {
//				System.out.println("이스터에그를 발견했습니다");
//			}
//			else {
//				System.out.println("잘못된 옵션입니다.");
//			}
			switch (result) {
			case 1:
				System.out.println("헬로우");
				break;
			case 2:
				System.out.println("안녕");
				break;
			case 3:
				System.out.println("종료합니다...");
				break;
			case 10000:
				System.out.println("이스터에그를 발견했습니다.");
				break;
			default:
				System.out.println("잘못된 옵션입니다.");
				break;
			}
			
			}
	}
