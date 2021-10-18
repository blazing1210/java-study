package staticMethod;

public class Cat {
	private String name;
	private int id;
	public static final String FOOD ="고양이 사료";
	private static int count =0;//생성한 꼬양이의 숫자
	public Cat(String name) {//생성자는 리턴타입이 없음 일반 메소드랑 다름
		this.name=name;
		count++;
	}
	@Override
	public String  toString() {
		return "고양이[아이디="+id+", 이름="+name+"]";
	}
	public static int getCount() {//스태틱 메소드
		//String n= name; 스테틱메소드에서 인스턴스(객체) 변수를 사용할 수 없음.
		return count;
	}
}
