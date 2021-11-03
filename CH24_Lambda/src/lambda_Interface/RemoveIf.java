package lambda_Interface;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

	public static void main(String[] args) {
		List<Integer>numbers=new ArrayList<>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(9);
		numbers.add(10);

		//removeIf 메소드는 리스트의 아이템을 precate의 test메소드로 검사해서 참이면 제거
		numbers.removeIf(n->n<6);
		
		numbers.forEach(t->System.out.println(t));
	}

}
