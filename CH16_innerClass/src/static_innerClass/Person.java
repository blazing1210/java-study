package static_innerClass;

public class Person {
	class Head{//내부클래스 Head
		public void print() {
			System.out.println("헤드");
		}
	}
	static class Body {//내부클래스 Body
		public void print() {
			System.out.println("바디");
		}
	}
	public void Print() {
		Head head =new Head();//헤드객체
		Body body = new Body();//바디객체
		head.print();
		body.print();
	}
	
}
