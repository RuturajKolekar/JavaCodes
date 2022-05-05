package MultiThreading;

class MyThreads extends Thread
{
   public void run()
   {
     int i=0;
     while(i<10)
     {
     System.out.println("Good Morning");  
     i++; 
     }
   }
}
class MyThreads1 extends Thread
{
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
        MyThreads t=new MyThreads();
        MyThreads1 t1=new MyThreads1();
         t.setPriority(Thread.NORM_PRIORITY);
         t1.setPriority(Thread.MAX_PRIORITY);
         System.out.println(t.getPriority());
         System.out.println(t1.getPriority());
         System.out.println(t.getState());
         System.out.println(t1.getState());
         t.start();
         t1.start();
         System.out.println(t.getState());
         System.out.println(t1.getState());
         System.out.println(Thread.currentThread().getState());
   }
 }

