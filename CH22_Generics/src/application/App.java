package application;

import collections.Wrapper;
import hierarchy.Cat;
import hierarchy.Creature;
public class App {

	public static void main(String[] args) {
		Wrapper <Cat> wrapper=new Wrapper <Cat>();//포장 클래스의 객체를 만듬
		Wrapper <Creature> wrapper2=new Wrapper<Creature>();
		Cat cat=new Cat("마틸다");	//고양이 마틸다 객체를 생성
		Creature creature=new Creature("생물");
		wrapper.set(cat);	//포장 객체의 set메소드에 마틸다 입력
		wrapper2.set(creature);
		Cat r1=wrapper.get();
		Creature r2=wrapper2.get();
		System.out.println(r1);
		System.out.println(r2);
	
	}

}
