package staticMethod;

import application.Cat;

public class App {
	public static void main(String[] args) {
		final String CAT_COUNT="����� ����:%d\n";
		//String.format�� printf�� ���ڿ��� ����, ����ƽ�޼ҵ� ���
		String catCount=String.format(CAT_COUNT,Cat.getCount());
		System.out.println(catCount);
		Cat cat1=new Cat("��ƿ��");
		Cat cat2=new Cat("���̾�");
		Cat cat3=new Cat("�����");
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		System.out.println(Cat.FOOD);
		
		catCount=String.format(CAT_COUNT,Cat.getCount());
		System.out.println(catCount);
		
		int x= add(1,1);
		System.out.println(x);
	}
	private static int add(int a,int b){
		return a+b;
	}
}
