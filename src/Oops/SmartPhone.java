package Oops;


class Phone
{
   void greet()
   {
         System.out.println("Hello World");
   }
   void on()
   {
         System.out.println("Turning On Phone.....");
   }
}
class SmartPhone extends Phone
{
    void on()
   {
         System.out.println("Turning On SmartPhone.....");
   }
   void color()
   {
         System.out.println("This is blue....");     
   }
         public static void main(String[]args)
         {
                Phone obj=new SmartPhone();
                      obj.greet();
                      obj.on(); 
           SmartPhone obj1=new SmartPhone();
                      obj1.color();               
         }
}
