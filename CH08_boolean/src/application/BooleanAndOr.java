package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		boolean isRaining=false;
		boolean mightRain=true;
		boolean haveUmbrella=false;
		if((isRaining||mightRain)&&haveUmbrella) {
			System.out.println("����� ����!");
		}
		else {
			System.out.println("����� ���� �ʴ´�.");
		}
		boolean rainCheck=isRaining||mightRain;
		
		if((rainCheck&&haveUmbrella) {
			System.out.println("����� ����!");
		}
		else {
			System.out.println("����� ���� �ʴ´�.");
		}
	}

}
