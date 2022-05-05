package Oops;


abstract class Oops3
{
   static int a;
   abstract void show();
    void display()
   {
     System.out.println("Default method in Abstract Class");
   }
   void view()
   {
     System.out.println("Static method At Abstract Class");
   }
}

interface I1
{
      
     void run();
}
interface I2 extends I1
{
     void fight();
}
 
class Milkha implements I1,I2
{
     public void run()
   {
        System.out.println("Milkha singh Runs Very Fast");
   }
     public void fight()
   {
        System.out.println("Milkha singh Fights Very Wells");
   }
   public static void main (String[]args)
     {
         Milkha m=new Milkha();
         m.run();
         m.fight();
     }
}

class New  extends Oops3
{
     void show()
     {
       System.out.println("I am From Abstract class Explore In New ");
     }
      void view()
   {
     System.out.println("Static method At New Class");
   } 
     public static void main (String[]args)
     {
       New obj=new New();
       obj.show();
       obj.view();
     
       System.out.println(a);
        
     }
}