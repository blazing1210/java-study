package constructor;

public class Person {
		//����
		private String name;
		private double height;
		//������ ��������
		public Person(){
			System.out.println("�� ����� ����!");
		}
		void setName(String name) {
			this.name=name;
		}
		String getName() {
			return name;
		}
		public void setHeight(double height) {
			this.height=height;
		}
		public double getHeight() {
			return height;
		}

}
