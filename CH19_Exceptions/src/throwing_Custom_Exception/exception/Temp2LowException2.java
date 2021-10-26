package throwing_Custom_Exception.exception;

public class Temp2LowException2 extends TempOutOfRangeException{

	private static final long serialVersionUID = 1L;
	
	public Temp2LowException2(String message) {
		//생성자 예외메세지를 상위 예외클래스에 처리
		super(message);//예외 클래스에서 메세지명으로 예외를 생성
	}
	
}
