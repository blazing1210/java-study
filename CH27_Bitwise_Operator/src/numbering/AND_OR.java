package numbering;

public class AND_OR {

	public static void main(String[] args) {
		// 비트연산 AND, OR
		
	
		int value1=0b01010011;
		int value2=0b11010110;
		
		int result1=value1&value2;
		
		System.out.println(toBinary(value1));
		System.out.println(toBinary(value2));
		System.out.println(toBinary(result1));
		System.out.println();
		
		int result2=value1|value2;
		
		System.out.println(toBinary(value1));
		System.out.println(toBinary(value2));
		System.out.println(toBinary(result2));
	}

	private static String toBinary(int n) {
		return String.format("%8s",Integer.toBinaryString(n)).replace(" ","0");
	}
}
