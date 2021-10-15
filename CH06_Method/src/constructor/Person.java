package constructor;

public class Person {
		//변수
		private String name;
		private double height;
		//생성자 생략가능
		public Person(){
			System.out.println("한 사람을 생성!");
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
