package application;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		//입력을 받는 클래스 scanner이용
		Scanner scanner = new Scanner(System.in);
		System.out.print("온도를 입력해 주세요 : ");
		double c= scanner.nextDouble();	//스캐너 객체의 nextInt() 메소드로 정수값을 입력
		double f=(c*9/5)+32;//화씨
		
		System.out.printf("섭씨%.1f는 화씨 %.1f이다.",c,f);

	}

}
