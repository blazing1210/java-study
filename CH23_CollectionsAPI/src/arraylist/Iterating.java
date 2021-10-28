package arraylist;

import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		//입력
		list.add(7);
		list.add(9);
		list.add(123);
		list.add(9999);
		
		for (Integer n:list) {
			System.out.println(n);
		}
		System.out.println();
		for(int i=0;i<list.size();i++) {
			Integer n=list.get(i);
			System.out.println("인덱스"+i+":"+n );
			}
		System.out.println();
		
		//리스트.forEach 메소드
		list.forEach(e->System.out.println(e));
		System.out.println();
		
		//메소드 레퍼런스
		list.forEach(System.out::println);
	}

}
