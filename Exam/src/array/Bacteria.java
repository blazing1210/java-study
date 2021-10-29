package array;

public class Bacteria {

	public static void main(String[] args) {
		int[] bacteriaCountLogs=new int[10];
		writeLog(bacteriaCountLogs);
		printLog(bacteriaCountLogs);

	}
	public static void writeLog(int[] log) {
		int result =1;
		for(int i=0;i<log.length;i++) {
			if(i!=0) {
			result=result*2;
			}
			log[i]=result;
		}
	}
	public static void printLog(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d",arr[i]);
			if(i!=arr.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
}
