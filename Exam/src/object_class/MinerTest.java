package object_class;

public class MinerTest {

	public static void main(String[] args) {
		Miner malon=new Miner("말런");
		Miner gloria=new Miner("글로리아");;
		malon.mine();
		malon.mine();
		malon.mine();
		gloria.mine();
		gloria.mine();
		System.out.println(malon);
		System.out.println(gloria);
		

	}

}
class Miner {
	String name;
	int coins;
	Miner(String str){
		name=str;
		coins=0;
	}
	@Override
	public String toString() {
		return String.format("Miner {name:%s, coins: %d}",name,coins);
	}
	public void mine() {
		coins+=1;
	}
}
