package throwing_Runtime_Exception;

public class App {

	public static void main(String[] args) {
		Thermostat2 stat =new Thermostat2();
		try {
			stat.setTemperature(36);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	

	}

}
