package game;
import java.util.Random;
import java.util.Scanner;

import game.objects2.GameObject;


public class Game {

	private Random random=new Random();
	private Scanner scanner=new Scanner(System.in);
	public void run() {
		System.out.println("�＼�� ������������ �����մϴ�.");
		int wins=0;
		for(int i=1;i<=3;i++) {
			System.out.println(i+"��° ������ �����մϴ�."); 
			//������ ����
			System.out.print("����(0),����(1),��(2)�� ���ڷ� ���� : ");
			int num = scanner.nextInt();
			GameObject[] objects= GameObject.values();
			GameObject ob1= objects[num];
			GameObject ob2= objects[random.nextInt(objects.length)];
			
			System.out.println("����Ǽ�����: "+ob1);
			System.out.println("��ǻ���� ������: "+ob2);
			int score=ob1.compare(ob2);
			wins=wins+score;
			}
		if(wins>0) {
			System.out.println("����� �¸�!");	
		}else if(wins<0) {
			System.out.println("����� �й�!");
		}else {
			System.out.println("�����ϴ�");
		}
		}
	
	}

