package application;

public class Cat {
	private String name;
	public static final String FOOD ="������ ���";
	private static int count =0;//������ �������� ����
	public Cat(String name) {//�����ڴ� ����Ÿ���� ���� �Ϲ� �޼ҵ�� �ٸ�
		this.name=name;
		count++;
	}
	@Override
	public String  toString() {
		return "������[�̸�="+name+"]";
	}
	public static int getCount() {//����ƽ �޼ҵ�
		//String n= name; ����ƽ�޼ҵ忡�� �ν��Ͻ�(��ü) ������ ����� �� ����.
		return count;
	}
}