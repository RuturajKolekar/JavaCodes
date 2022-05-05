package MultiThreading;

class MyThread5 extends Thread
{
   public void run()
    {
      System.out.println("After Starting: "+Thread.currentThread().isAlive());
      System.out.println("Thread name is: "+Thread.currentThread().getName());
    }
    
    public static void main(String[]args)
    {
        System.out.println("It is Printed by: "+Thread.currentThread().getName());
        MyThread5 t=new MyThread5();
        System.out.println("Before Starting : "+t.isAlive());
         t.start();
         t.setName("Ruturaj");
         System.out.println("Main Thread Is alive : "+Thread.currentThread().isAlive());
        
    }
}