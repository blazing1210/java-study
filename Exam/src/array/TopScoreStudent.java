package array;

public class TopScoreStudent {

	public static void main(String[] args) {
		String[] names= {"Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel"};
		int[] scores= {65,74,23,75,68,96,88,98,54};
		int i=topIndex(scores);
		
		System.out.printf("1등:%s(%d점)\n",names[i],scores[i]);
	}
	public static int topIndex(int[] arr) {
		/* 해당 함수를 완성하세요. */
		int index = 0;
		for(int i=0,temp=0; i<arr.length; i++) {
			if(arr[i] > temp) {
				temp = arr[i]; 
				index = i;
			}
		}
		return index;
	}
}
