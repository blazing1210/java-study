package static_innerClass;

public class Person {
	class Head{//����Ŭ���� Head
		public void print() {
			System.out.println("���");
		}
	}
	static class Body {//����Ŭ���� Body
		public void print() {
			System.out.println("�ٵ�");
		}
	}
	public void Print() {
		Head head =new Head();//��尴ü
		Body body = new Body();//�ٵ�ü
		head.print();
		body.print();
	}
	
}
