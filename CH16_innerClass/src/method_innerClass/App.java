package method_innerClass;

public class App {
	private static String name;
	
	public App() {
		//�⺻ ������
		name="�ٸ��ں���";
	}
	
	public String getName() {
		return name;
	}
	public void run() {
		class Printer{
			public void print() {
				System.out.println(name);
				//����Ŭ�������� �ܺ�Ŭ������ ���� ��밡��
			}
		}
		new Printer().print();
	}
	public static void main(String[] args) {
		//�޼ҵ� ���� Ŭ����
		System.out.println(name);
		
		App app=new App();
		app.run();

		
	}

}
