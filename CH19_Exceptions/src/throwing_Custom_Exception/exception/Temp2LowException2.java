package throwing_Custom_Exception.exception;

public class Temp2LowException2 extends TempOutOfRangeException{

	private static final long serialVersionUID = 1L;
	
	public Temp2LowException2(String message) {
		//������ ���ܸ޼����� ���� ����Ŭ������ ó��
		super(message);//���� Ŭ�������� �޼��������� ���ܸ� ����
	}
	
}
