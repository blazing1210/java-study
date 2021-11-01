package arraylist;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//스캐너 사용해 리스트에 실수를 입력해 출력
		Scanner scanner=new Scanner(System.in);
		
		List<Double> numbers=new LinkedList<>();
		
		
//		ArrayList<Double> numbers=new ArrayList<>();
		
		while(true) {
		System.out.println("숫자또는'q'입력>");
		
		String input =scanner.nextLine();
		input=input.trim();
		//문자열숫자
		if(input.equalsIgnoreCase("q")){
			break;
		}
		try {
			double value=Double.parseDouble(input);
			numbers.add(value);//입력한 실수를 리스트에 저장
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
			continue;
		}
		
		}
		
		scanner.close();
		if(numbers.size()>0) {
			System.out.println("입력된 숫자 : ");
			double total=0;
			Collections.sort(numbers);
			for(Double number:numbers) {
				System.out.printf("%.2f\n",number);
				total=total+number;
			}
			System.out.printf("평균값은%.2f\n",total/numbers.size());
			}else {
				System.out.println("실수가 입력되지 않았습니다.");
			}
		}
		}

