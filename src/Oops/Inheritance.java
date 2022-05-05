package Oops;


class A
{
  void showA()
  {
    System.out.println("Hi I am A");
    
  }
}
class B extends A
{
   void showB()
   {
    System.out.println("Hi I am B");   
   }
   public static void main (String[]args)
   {
     A a =new A();
    a.showA();
     System.out.println("--------------------");
     B ob=new B();
     ob.showA();
     ob.showB();
     System.out.println("--------------------");
   }
}
class C extends B
{
   void showC()
   {
    System.out.println("Hi I am c");   
   }
   public static void main (String[]args)
   {
     C c=new C();
     c.showA();
     c.showB();
     c.showC();
   }

}