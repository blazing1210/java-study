package application;
import java.util.Scanner;

import java.util.Random;

public class Hangman {
	//���ӽ���
	RandomWord word= new RandomWord();
	private boolean running=true;
	private Scanner scanner=new Scanner(System.in);
	public void run() {
	
//	1. ȭ�鿡 �ܾ�ǥ��
//	2. �Է�
//	3. ö�ڰ� �´��� üũ (�� ������ ����)
			do {
				displayWord();//ȭ�鿡 �ܾ�ǥ��
				getUserInput();//�Է¹���
				checkUserInput();//�´��� üũ �� ������ running = false
				
			}while(running);
		}
	
		public void checkUserInput() {
			System.out.println("üũ");
		}
		public void getUserInput() {
			//�������� �� ���� �Է¿䱸
			//�Է¹��� ���ڿ����� �� ���ڸ� �̾Ƽ� RandomWord ��ü�� ���� addGuess�޼ҵ�
			System.out.print("�� ���� �Է�: ");
			String guess=scanner.nextLine();
			word.addGuess(guess.charAt(0));
		}
		public void displayWord() {
			System.out.println(word.toString());
			}
}
