package chocoBank;


import java.util.Random;

public class Todays_fortune {
	Random ran=new Random();
	int rannumber=ran.nextInt(9)+1;
	
	int colorIndex=ran.nextInt(5)+1;
	String randomColor="";
	
	void run() {
		switch(colorIndex) {
		case 1:
			randomColor="빨간색";
			break;
		case 2:
			randomColor="초록색";
			break;
		case 3:
			randomColor="분홍색";
			break;
		case 4:
			randomColor="파란색";
			break;
		case 5:
			randomColor="노란색";
			break;
		default:
			randomColor="검은색";
		}
		final int number=rannumber;
		final String color=randomColor;
		System.out.printf("오늘의 행운의 숫자는 %d 이며 럭키컬러는 %s입니다.",number,color);
		
		
	}
}
