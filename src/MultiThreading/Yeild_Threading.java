package MultiThreading;


class Medical1 extends Thread {
	public void run(){
		try {
		    for(int i=1;i<=5;i++) {
		    	System.out.println(Thread.currentThread().getName()+": "+i);
                Thread.sleep(2000);
		    }
		}
		    catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
     }

public class Yeild_Threading {

	public static void main(String[] args) throws InterruptedException {
		Medical1 m= new Medical1();
		m.start();
		Thread.currentThread();
		Thread.yield();
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
			Thread.sleep(2000);
		}
    }
}
