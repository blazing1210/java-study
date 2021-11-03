package object_class;

public class Foodtest {

	public static void main(String[] args) {
		Food chicken=new Food("치킨",18000);
		Food pizza=new Food("피자",28000);
		Food sushi=new Food("초밥세트",22000);
		Food [] foods= {chicken,pizza,sushi};
		for(int i=0;i<foods.length;i++) {
			System.out.println(foods[i].toString());
		}
	}

}
class Food{
	String food;
	int price;
	Food(String food,int price){
		this.food=food;
		this.price=price;
		
	}
	@Override
	public String toString() {
		return "Food {name=" + food + ", price=" + price + "원}";
	}

	

	
}
