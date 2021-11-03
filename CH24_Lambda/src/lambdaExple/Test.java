package lambdaExple;

//함수형 인터페이스 : 추상메서드가 단 하나일때!
@FunctionalInterface
public interface Test {
	void run();//추상메서드
	//void run2(); 에러
}
