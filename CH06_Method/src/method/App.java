package method;


public class App {

	public static void main(String[] args) {
		Person p1=new Person();
		System.out.println(p1.name);//���� �ڷ��� String�� NULL���� �ʱⰪ
		System.out.println(p1.age);//int�� 0�� �ʱⰪ
		p1.sayHello();//Ŭ���� �ȿ� �ִ� �Լ�(�޼ҵ�) �޼ҵ�ȣ��
		p1.name="���";
		p1.age=7;
		p1.sayHello();
		Person p2=new Person();
		p2.name="�浿";
		Person p3=new Person();
		p3.name="���̾�";
		p2.sayHello();
		p3.sayHello();
	}

}