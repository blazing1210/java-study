package method_innerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	private static String name;
	public App() {
		//�⺻ ������
		name="�ٸ��ں���";
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
		//�޼ҵ� ���� Ŭ����
		System.out.println(name);
		
		App app=new App();
		app.run();

		
	}
	}
