package application;

public class StringArray2 {

	public static void main(String[] args) {
		// String�� ���� �ڷ���, ���� ������ �ּҰ��� ���´�.
		String text=null;//���� ���������� �ּҰ��� ����.
		text= new String("��ο�!");
		System.out.println(text);
		String[] texts=null;
		System.out.println(texts);
		texts=new String[3];
		System.out.println(texts[1]);
		
		texts[0]=new String("����");
		texts[1]="�ȳ�?";
		texts[2]="�� ����!";
		for(String word: texts) {
			System.out.println(word);
		}
	}

}
