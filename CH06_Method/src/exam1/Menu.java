package exam1;

public class Menu {
	String[] options= {"�����ۺ���","������ �߰�","������ ����","����"};
	void display() {
		System.out.println("�޴��� ����:");
		for(int i=0;i<options.length;i++) {
			System.out.printf("%d.%s\n", i,options[i]);
		}
	}
}
