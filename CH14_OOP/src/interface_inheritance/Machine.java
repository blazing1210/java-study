package interface_inheritance;

public class Machine implements DefaultRannable{

	@Override
	public void displayDetails() {
		System.out.println("표시할 디테일 없음");
		
	}

	@Override
	public void run() {
		System.out.println("머신 러닝!");
		
	}

	
	
}
