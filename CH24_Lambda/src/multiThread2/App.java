package multiThread2;

public class App {
	
	private int value=0;
	
	private synchronized void increment() {//synchronized 로 한 쓰레드가 사용중에 다른 쓰레드 사용못함
		value++;
	}
	public void run() throws InterruptedException{
		
		Runnable runnable=()->{
			for(int i=0;i<1000;i++) {
				System.out.println("i: "+i);
				increment();
				
				
			}	
		};
		
		Thread t1=new Thread(runnable);
		Thread t2=new Thread(runnable);
		
		//t1.star() 메소드는 t1의 runnable 람다식 실행
		t1.start();
		t2.start();
		System.out.println("Value : "+value);
		
		t1.join();//메인 쓰레드를 마지막에 실행
		t2.join();
		System.out.println("Value : "+value);
	}

	public static void main(String[] args) throws InterruptedException   {
		//앱객체생성해서 메소드 run실행
		new App().run();
	}

}
