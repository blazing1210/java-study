package throwing_Custom_Exception.copy;

import throwing_Custom_Exception.exception.Temp2HighException;
import throwing_Custom_Exception.exception.Temp2LowException2;


public class Thermostat2 {
	public void setTemperature(double temperature) throws Temp2HighException, Temp2LowException2{
		if(temperature<0) {
			//�µ����� ���������� ���ܼ� ���� ó���Ѵ�.throw�� �ϴ� ���ܸ� ���߿� ó��(�� �޼ҵ带 ȣ���Ҷ� ó��))
			throw new Temp2LowException2("�µ��� �ʹ� �����ϴ�..");
		}else if(temperature>35) {
			throw new Temp2HighException("�µ��� �ʹ� �����ϴ�.");
		}
		System.out.println("�µ� ����:"+temperature);
	}
}
