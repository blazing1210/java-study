package getthersetter;

public class Person {
	//Ŭ�����ȿ� ���� ������ �ν��Ͻ� ������ �ϰ� > ��ü������ ��밡��(������)
	private String name;
	private int age;
	void setName(String name) {
		this.name=name;
		//this�� ���� Ŭ������ ��ü(Person)�� ����Ŵ
	}
	String getName() {
		return name;
	}
	void setAge(int age) {
		this.age=age;
	}
	int getAge() {
		return age;
	}
	}
