package object_class;

public class SquareTest {

	public static void main(String[] args) {
		Square square=new Square();
		square.length=4;
		square.area();
		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이:%d",square.length,square.area());
	}
	
}


class Square{
	int length;
	
	int area() {
		return length*length;
	}
}
