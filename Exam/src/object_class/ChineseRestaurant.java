package object_class;

public class ChineseRestaurant {

	public static void main(String[] args) {
		Menu jjajang=new Menu("짜장",4900);
		Menu jjabbong=new Menu("짬뽕",5900);
		Menu tangsook=new Menu("탕수육",13900);
		Menu[] MenuArr= {jjajang,jjabbong,tangsook};
		Order order=new Order(123,MenuArr);
		
		System.out.printf("주문 합계:%d원\n",order.totalPrice());
		
	}

}
class Order{
	int orderNum;
	int total;
	Menu[] menus;
	public Order(int i,Menu[] arr) {
		orderNum=i;
		menus=arr;
		
	}
	public int totalPrice(){
		for(int i=0;i<menus.length;i++) {
			total+=menus[i].price;
		}
		
		return total;
	}
}


class Menu{
	String name;
	int price;
	Menu(String name,int price){
		this.name=name;
		this.price=price;
	}
	
}