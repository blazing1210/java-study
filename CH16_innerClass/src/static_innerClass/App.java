package static_innerClass;

public class App {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.Print();
		//�̳�Ŭ����(��ü�� ���鶧�� ���� �ܺ�Ŭ���� ��ü�� ����� ���� ���ִ�(PersonŬ����))
		Person.Head head=p1.new Head();
		head.print();
		//����ƽ �̳� Ŭ���� �ܺΰ�ü���� �ٷ�.Body();
		Person.Body body=new Person.Body();
		body.print();

	}

}
