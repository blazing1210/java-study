package throwing_Exception;

public class App {

	public static void main(String[] args) {
		//예외 처리를 넘김
		Thermostat2 stat =new Thermostat2();
		//setTemperature 메소드에서 예외처리를 throw했기때문에 호출할때 처리해야한다.
		//try-catch는 바로처리throw는넘김
		try {
			stat.setTemperature(36);
		} catch (Exception a) {
			//e.printStackTrace();
			System.out.println(a.getMessage());
			
		}

	}

}
