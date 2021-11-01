package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_list {

	public static void main(String[] args) {
		ArrayList<Double> doubles =new ArrayList<>();
		ArrayList<Integer> list =new ArrayList<>();
		doubles.add(7.38);
		doubles.add(3.88);
		doubles.add(1.45);
		doubles.add(2.35);
		doubles.add(9.28);
		
		list.add(9);
		list.add(7);
		list.add(5);
		list.add(19);
		list.add(14);
		
		Collections.sort(doubles);
		Collections.sort(list);
		
		doubles.forEach(System.out::println);
		System.out.println();
		list.forEach(System.out::println);
		
		ArrayList<Person> people=new ArrayList<>();
		
		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));
		
		people.forEach(System.out::println);

	}

}
