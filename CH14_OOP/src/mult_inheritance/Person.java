package mult_inheritance;

public class Person implements Greeter,Speaker{
	//�������̽��� ���� ��������,���(extends)�� �ϳ�������
	@Override
	public void speak() {
		System.out.println("ȯ���մϴ�.");
		
	}

	@Override
	public void greet() {
		System.out.println("���� Person�Դϴ�.");
		
	}

}
