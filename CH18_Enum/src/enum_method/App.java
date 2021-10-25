package enum_method;

public class App {

	public static void main(String[] args) {
		//values()�޼ҵ� �ش� enum�� ��� ����� ������ �迭�� ����
	
//		Fruit[] fruits=Fruit.values();
		for(Fruit f: Fruit.values()) {
			System.out.println(f);
		}
		//ordinal()�޼ҵ�� ����� ������ ����
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		//valueOf("��")�޼ҵ� ���� ���� ����� ã�Ƽ� ����
		Fruit f1= Fruit.valueOf("ORANGE");//���忭 ORANGE�� ���� ���� ���� enum����� ����
		System.out.println(f1);
		System.out.println(f1==Fruit.ORANGE);
	}
	
	
}
