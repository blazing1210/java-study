package application;

import java.util.Random;

public class RandomWord {
	private String books="negotiation selection profession property category apartment possession transportation measurement relationship indication recommendation introduction inspection addition football department midnight independence reception";
	private String[] words =books.split(" ");
	private char[] characters;
	private String selectWord;
	public RandomWord() {
		Random ran=new Random();
		selectWord=words[ran.nextInt(words.length)];//�������� �ܾ ����
		characters=new char[selectWord.length()];// ���ڹ迭 ���� ����
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
//		for(char c: characters) {
//			
//			if(c=='\u0000') {
//				sb.append('_');
//			} else {
//				 sb.append(c);
//			}
			for(char c:characters) {
			sb.append(c=='\u0000'?'_':c);
			sb.append(' ');
			}
		System.out.println(selectWord);
		return sb.toString();
	}
	public void getWords() {
		
		for(String w: words) {
			System.out.println(w);
		}
	}
	public void addGuess(char c) {
		//����ڰ� �Է��� �ѹ��ڸ� ���õ� �ܾ�� ������ �ִ��� Ȯ��
		//������ characters �� �ε��� ��ġ�� �Է�
		for(int i=0;i<selectWord.length();i++) {
			if(c==selectWord.charAt(i)) {
				characters[i]=c;
			}
		}
	}
}
