package application;

public class Printf {

	public static void main(String[] args) {
		int age=25;
		String addr="부산";
		System.out.printf("내 나이는 %d살 입니다.\n", age);
		System.out.printf("내가 사는 도시는 %s 입니다.\n",addr);
		
		double pi=3.14592;
		System.out.printf("파이의 값은:%.2f",pi); //%f 사이에 .2 소수점2자리
		
	}

}
