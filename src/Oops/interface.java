package Oops;


interface Aa
{
   int emp_id=101;
   String emp_name="Ruturaj";
   String emp_address="Kolhpur";
   void show_emp_details();
    default void show3()
    {
      System.out.println("I am In Interface");
    }
}
interface Bb  
{
   int emp_salary=45000;
   void show_salary();
   static void showA()
   {
     System.out.println("I am static method in Interface");
   }
}
class Cc extends D implements Aa,Bb
{
  public void show_salary()
  {
    double gross= emp_salary+(emp_salary*0.05);
    System.out.println("emp_salary = "+gross);
  }
  public void show_emp_details()
  {
    System.out.println("emp_id = "+emp_id);
    System.out.println("emp_name = "+emp_name);
    System.out.println("emp_address = "+emp_address); 
  }
  void show2()
  {
     System.out.println("I am Workless Tooooooo");
  }
  public static void main(String[]args)
  {
     Cc c=new Cc();
       c.show_emp_details();
       c.show_salary();
       c.show();
       c.show2();
       c.show3();
    
     
  }
}
abstract class D 
{
   abstract void show2();
 
   void show()
   {
       System.out.println("I am Workless");
   }
}