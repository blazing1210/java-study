package constructorParameter;


public class Person {
		public Person() {
			name="�ſ��̻�";
			height=0.0;
		}
		//����
	
		private String name;
		private double height;
		//������ ��������
		public Person(String name,double height){
			this.name=name;
			this.height=height;
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
		public String toString() {
			String text ="�̸�: "+name+" Ű :"+height;
			return text;
		}

}
