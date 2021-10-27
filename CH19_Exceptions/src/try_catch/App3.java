package try_catch;

import java.util.Scanner;

public class App3 {
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int number=getNumber();
			
		System.out.print("입력한 숫자는: "+number);
		scanner.close();
	}
		private static int getNumber() {
			int number=0;
			boolean isNumber=false;
			do {
			System.out.print("숫자를 입력 : ");
			String line  = scanner.nextLine();
			try {//에러가 날수 있는 코드를 try문 안에 넣는다.
			number=Integer.parseInt(line);
			isNumber=true;
			} catch (Exception e) {//try에서 에러 발생시 catch문에서 처리한다.
			System.out.println("숫자 입력이 아닙니다.\n");
			}
		}while(!isNumber);
		
		return number;
	}
	
}
