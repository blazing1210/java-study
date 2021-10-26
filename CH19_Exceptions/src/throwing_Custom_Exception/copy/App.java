package throwing_Custom_Exception.copy;

import throwing_Custom_Exception.exception.Temp2HighException;
import throwing_Custom_Exception.exception.Temp2LowException2;

public class App {

	public static void main(String[] args) {
		Thermostat2 stat =new Thermostat2();
		try {
			stat.setTemperature(-5);
		}catch(Temp2HighException e) {
			System.out.println(e.getMessage());
		} catch (Temp2LowException2 e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	

	}

}
