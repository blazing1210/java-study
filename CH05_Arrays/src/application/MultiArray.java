package application;

public class MultiArray {

	public static void main(String[] args) {
		// 이중배열
		String[][] texts= {
				{"하나","둘","셋"},
				{"넷","다섯","여섯"},
				{"일곱","여덟","아홉"},
				{"열","열하나","열둘"}
		};
		for(int i=0;i<texts.length;i++) {
			String[] innerArray=texts[i];
			for(int j=0;j<innerArray.length; j++) {
				System.out.printf("%s\t",innerArray[j]);
			}
		}
		for(int i=0; i<texts.length;i++) {
			for(int j=0; j<texts[i].length;j++) {
				System.out.printf("%s\t",texts[i][j]);
			}
		}
	}

}
