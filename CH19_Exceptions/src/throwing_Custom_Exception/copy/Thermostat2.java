package throwing_Custom_Exception.copy;

import throwing_Custom_Exception.exception.Temp2HighException;
import throwing_Custom_Exception.exception.Temp2LowException2;


public class Thermostat2 {
	public void setTemperature(double temperature) throws Temp2HighException, Temp2LowException2{
		if(temperature<0) {
			//온도값이 비정상으로 여겨서 예외 처리한다.throw는 일단 예외를 나중에 처리(이 메소드를 호출할때 처리))
			throw new Temp2LowException2("온도가 너무 낮습니다..");
		}else if(temperature>35) {
			throw new Temp2HighException("온도가 너무 높습니다.");
		}
		System.out.println("온도 세팅:"+temperature);
	}
}
