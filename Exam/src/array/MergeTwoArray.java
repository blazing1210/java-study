package array;

public class MergeTwoArray {

	public static void main(String[] args) {
		int [] evens= {0,2,4,6,8};
		int [] odds= {1,3,5,7,9};
		int [] result= merge(evens,odds);
		System.out.print("결과 : ");
		for (int i=0;i<result.length;i++) {
			System.out.printf("%d ",result[i]);
		}
	}
	public static int[] merge(int[] arr1,int[] arr2) {
		int[] mergeArr=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			mergeArr[i*2]=arr1[i];
			mergeArr[i*2+1]=arr2[i];
		}
		return mergeArr;
	}
}
