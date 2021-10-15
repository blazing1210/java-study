package constructorParameter;


public class Person {
		public Person() {
			name="신원미상";
			height=0.0;
		}
		//변수
	
		private String name;
		private double height;
		//생성자 생략가능
		public Person(String name,double height){
			this.name=name;
			this.height=height;
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
		public String toString() {
			String text ="이름: "+name+" 키 :"+height;
			return text;
		}

}
