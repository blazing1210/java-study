package application;

public class ex2 {
	public static void main(String[] args) {
		int[][] values= {{1,5,7},{9,6,3},{2,4,6},{1,2,3,4,5}};
		int total=0;
		for(int i=0; i<values.length;i++) {
			for (int j=0; j<values[i].length;j++) {
				total+=values[i][j];
			}
		}
		System.out.println("총합은 : "+ total);
	}
}
