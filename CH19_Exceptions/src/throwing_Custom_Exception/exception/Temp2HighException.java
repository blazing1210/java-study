package throwing_Custom_Exception.exception;

public class Temp2HighException extends TempOutOfRangeException{

	private static final long serialVersionUID = 1L;
	
	public Temp2HighException(String message) {
		//������ ���ܸ޼����� ���� ����Ŭ������ ó��
		super(message);//���� Ŭ�������� �޼��������� ���ܸ� ����
	}
	
}
