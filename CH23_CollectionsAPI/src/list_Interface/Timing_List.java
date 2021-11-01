package list_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_List {

	public static void main(String[] args) {
		List<Integer> arrayList=new ArrayList<>();
		List<Integer> linkedList=new LinkedList<>();
		//클래스 가져올때 단축키 Ctrl_Space, 여러개 한꺼번에 Ctrl+Shift+o
		
		long duration = timeOperation(arrayList);
		
		System.out.println("측정시간:"+duration);
		

	}

	private static long timeOperation(List<Integer> list) {
		long start=System.currentTimeMillis();

		for(int i=0;i<100000;i++) {
			list.add(0,i);
		}
		return System.currentTimeMillis() - start;
	}

}
