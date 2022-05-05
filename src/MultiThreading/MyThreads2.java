package MultiThreading;

class MyThreads2 extends Thread
{
   MyThreads2(String name)
   {
     super(name);
   }
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
class MyThreads3 extends Thread
{
   MyThreads3(String name)
   {
     super(name);
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
        MyThreads2 t=new MyThreads2("Ruturaj");
        MyThreads2 t1=new MyThreads2("Kolekar");
        MyThreads3 t2=new MyThreads3("Sagar");
        MyThreads3 t3=new MyThreads3("Gawade");
        t.start();
        t2.start();
        System.out.println("The Name Of Thread is "+t.getName());
        System.out.println("The Id Of Thread is "+t.getId());
        System.out.println("The Name Of Thread is "+t2.getName());
        System.out.println("The Id Of Thread is "+t2.getId());
        System.out.println("The Name Of Thread is "+t1.getName());
        System.out.println("The Id Of Thread is "+t1.getId());
        System.out.println("The Name Of Thread is "+t3.getName());
        System.out.println("The Id Of Thread is "+t3.getId());
       
       
         
         
   }
 }

