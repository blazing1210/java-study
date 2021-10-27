package try_catch;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("숫자를 입력 : ");
	String line  = scanner.nextLine();
	
	int number=0;
	boolean isNumber=false;
	
	try {//에러가 날수 있는 코드를 try문 안에 넣는다.
		number=Integer.parseInt(line);
		isNumber=true;
	} catch (Exception e) {//try에서 에러 발생시 catch문에서 처리한다.
		System.out.println("숫자 입력이 아닙니다.");
	}
	if(isNumber) {
	System.out.println("입력한 숫자는: "+number);
	}
	scanner.close();
	}

}
