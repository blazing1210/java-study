package numbering;

public class XOR_NOT {

	public static void main(String[] args) {
		// 비트연산 AND, OR
		
	
		int value1=0b01010011;
		int value2=0b11010110;
		
		int result1=value1^value2;//비트 XOR연산:같으면 0 다르면1
		
		System.out.println(toBinary(value1));
		System.out.println(toBinary(value2));
		System.out.println(toBinary(result1));
		System.out.println();

		//NOT연산
		System.out.println(toBinary(~result1));
		
		
	}

	private static String toBinary(int n) {
		return String.format("%8s",Integer.toBinaryString(n).replace(" ","0"));
	}
}
