package school;

public class Student {
	private String name;
	private int age;
	private boolean isvisible;
	private double temperatuer;
	public Student() {
		name="이름모름";
		age=18;
		isvisible=false;
		temperatuer=36.5;
	}
	
	public Student(String name, int age, boolean isvisible, double temperatuer) {
		super();
		this.name = name;
		this.age = age;
		this.isvisible = isvisible;
		this.temperatuer = temperatuer;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isIsvisible() {
		return isvisible;
	}
	public void setIsvisible(boolean isvisible) {
		this.isvisible = isvisible;
	}
	public double getTemperatuer() {
		return temperatuer;
	}
	public void setTemperatuer(double temperatuer) {
		this.temperatuer = temperatuer;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", isvisible=" + isvisible + ", temperatuer=" + temperatuer
				+ "]";
	}
}
