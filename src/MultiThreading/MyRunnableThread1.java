package MultiThreading;

class MyRunnableThread implements Runnable
{
    public void run()
    {
      int i=0;
      while(i<100)
      {
        System.out.println("I am Ruturaj....");
        i++;
      }
    }
}
class MyRunnableThread1 implements Runnable
{
    public void run()
    {
      int i=0;
      while(i<100)
      {
        System.out.println("I am Not Stoppable..../././...");
        i++;
      }
    }
  
   public static void main(String[]args)
   {
      MyRunnableThread k=new MyRunnableThread();
      Thread r=new Thread(k);
      MyRunnableThread1 k1=new MyRunnableThread1();
      Thread r1=new Thread(k1);
      r.setPriority(10);
      r1.setPriority(3);
      r.start();
      r1.start();
   }
}