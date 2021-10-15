package application;
import java.util.Scanner;

import java.util.Random;

public class Hangman {
	//게임시작
	RandomWord word= new RandomWord();
	private boolean running=true;
	private Scanner scanner=new Scanner(System.in);
	public void run() {
	
//	1. 화면에 단어표시
//	2. 입력
//	3. 철자가 맞는지 체크 (다 맞으면 종료)
			do {
				displayWord();//화면에 단어표시
				getUserInput();//입력받음
				checkUserInput();//맞는지 체크 다 맞으면 running = false
				
			}while(running);
		}
	
		public void checkUserInput() {
			System.out.println("체크");
		}
		public void getUserInput() {
			//유저에게 한 문자 입력요구
			//입력받은 문자열에서 그 문자를 뽑아서 RandomWord 객체에 전달 addGuess메소드
			System.out.print("한 문자 입력: ");
			String guess=scanner.nextLine();
			word.addGuess(guess.charAt(0));
		}
		public void displayWord() {
			System.out.println(word.toString());
			}
}
