package method;

public class Waking {

	public static void main(String[] args) {
		
		double result=calculateCalory(5000);
		System.out.println("¼Ò¸ðÄ®·Î¸®: "+result+" kcal");

	}
	private static double calculateCalory(int walk) {
		return 0.02*walk;
	}
}
