package throwing_Exception;

public class App {

	public static void main(String[] args) {
		//���� ó���� �ѱ�
		Thermostat2 stat =new Thermostat2();
		//setTemperature �޼ҵ忡�� ����ó���� throw�߱⶧���� ȣ���Ҷ� ó���ؾ��Ѵ�.
		//try-catch�� �ٷ�ó��throw�³ѱ�
		try {
			stat.setTemperature(36);
		} catch (Exception a) {
			//e.printStackTrace();
			System.out.println(a.getMessage());
			
		}

	}

}
