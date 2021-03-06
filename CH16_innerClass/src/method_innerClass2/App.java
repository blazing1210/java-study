package method_innerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	private static String name;
	public App() {
		//기본 생성자
		name="앨리자베스";
	}


//	public void run() {
//		class Printer implements Runnable{
//			@Override
//			public void run(){
//				System.out.println(name);
//				}
//			}	
//		new Printer().print();
		ScheduledExecutorService service= Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out.println(name);}
			}, 0, 1, TimeUnit.SECONDS);
	}

	public static void main(String[] args) {
		//메소드 안의 클래스
		System.out.println(name);
		
		App app=new App();
		app.run();

		
	}
	}
