package MultiThreading;

class MyThreads4 implements Runnable
{
   MyThreads4()
   {
     super();
   }
   public void run()
   {
     int i=0;
     while(i<10)
     {
      System.out.println("WellCome");
      i++; 
     }
   }
   public static void main(String[]args)
   {
        MyThreads4 m=new MyThreads4();
        Thread t=new Thread(m);
        t.start();
       
    }
}