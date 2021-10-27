package application;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		int numbers[]=new int[3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<numbers.length;i++) {
			System.out.print("숫자를 입력: ");
			numbers[i]=scan.nextInt();
			
		}
		scan.close();
		int total=0;
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
			total+=numbers[i];
		}
		System.out.printf("합계: %d",total);
	}

}
