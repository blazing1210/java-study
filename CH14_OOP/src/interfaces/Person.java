package interfaces;

public class Person implements Describable{
	@Override
	public String getDescription() {
		return "사람 입니다";
	}
}
