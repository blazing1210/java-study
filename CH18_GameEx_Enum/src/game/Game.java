package game;
import java.util.Random;
import java.util.Scanner;

import game.objects2.GameObject;


public class Game {

	private Random random=new Random();
	private Scanner scanner=new Scanner(System.in);
	public void run() {
		System.out.println("삼세판 가위바위보를 시작합니다.");
		int wins=0;
		for(int i=1;i<=3;i++) {
			System.out.println(i+"번째 게임을 시작합니다."); 
			//유저의 선택
			System.out.print("가위(0),바위(1),보(2)중 숫자로 선택 : ");
			int num = scanner.nextInt();
			GameObject[] objects= GameObject.values();
			GameObject ob1= objects[num];
			GameObject ob2= objects[random.nextInt(objects.length)];
			
			System.out.println("당신의선택은: "+ob1);
			System.out.println("컴퓨터의 선택은: "+ob2);
			int score=ob1.compare(ob2);
			wins=wins+score;
			}
		if(wins>0) {
			System.out.println("당신의 승리!");	
		}else if(wins<0) {
			System.out.println("당신의 패배!");
		}else {
			System.out.println("비겼습니다");
		}
		}
	
	}
