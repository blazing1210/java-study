package object_class;

public class ItemTest {

	public static void main(String[] args) {
		Item strom=new Item("스톰 브레이커",600);
		Item gauntlet=new Item("인피니티 건틀렛",999);
		Item bow=new Item("호크아이의 활",50);
		Item shield=new Item("캡틴아메리카의 방패",50);
		Item [] items= {strom,gauntlet,bow,shield};
		for(int i=0;i<items.length;i++) {
			System.out.println(items[i].toString());
		}
	}

}

 class Item {
	 String name;
	 int power;
	Item(String name,int power){
		this.name=name;
		this.power=power;
	}
	@Override
	public String toString() {
		return String.format("Item{name:%s,power:%d}", name,power);
	}
	
}