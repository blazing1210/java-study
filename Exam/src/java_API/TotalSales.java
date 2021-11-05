package java_API;


import java.util.ArrayList;

public class TotalSales {

	public static void main(String[] args) {
		Menu menu1=new Menu("김밥",2000,57);
		Menu menu2=new Menu("돈까스",6000,29);
		Menu menu3=new Menu("김밥",5000,34);
		Store store=new Store();
		store.add(menu1);
		store.add(menu2);
		store.add(menu3);
		System.out.printf("총 매출:%d원",store.totalSales());
		
		
	}

}
class Store {
	private ArrayList<Menu> list;

	public Store() {
		this.list = new ArrayList<Menu>();
	}
	public void add(Menu menu) {
		list.add(menu);
	}
	
	public int totalSales() {
		int sum=0;
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i).getPrice()*list.get(i).getCount();
		}
		return sum;
	}
}
class Menu{
	private String name;
	private int price;
	private int count;
	
	public Menu(String name, int price,int count) {
		this.name=name;
		this.price=price;
		this.count=count;
		
	}

	public int getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	}
}