package MultiThreading;



class Medical extends Thread {
  public void run(){
	  System.out.println("Medical Cheaking....");
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	  System.out.println("Medical Cheaking Complited.");
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
  }
  
}
class TestDrive extends Thread{
	public void run(){
		  System.out.println("test Drive Start....");
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		  System.out.println("test Drive Complited.");
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	  }
}
class OfficerSign extends Thread{
	public void run(){
		  System.out.println("Document Offers to Officer....");
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		  System.out.println("Officer Sign Complited.");
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	  }
}
public class Liesence {

	public static void main(String[] args) throws InterruptedException {
		Medical m=new Medical();
		m.start();
		m.join();
		TestDrive td=new TestDrive();
		td.start();
		td.join();
		OfficerSign os=new OfficerSign();
		os.start();
		os.join();
		System.out.println("I got My licence!!!!!!!!");
		

	}

}
