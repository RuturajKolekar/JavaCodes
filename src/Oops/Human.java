package Oops;


class Monkey
{
   void jump()
   {
     System.out.println("I am Jumping....Jhapak");
   }
   void bite()
   {
    System.out.println("I am Biting....Kachaaa");  
   }
   void speak()
   {
    System.out.println("Hi Human.....");
   } 
}
interface BasicAnimal
{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal
{
      public void eat()
      {
        System.out.println("I am Eating....");
      }
      public void sleep()
      {
        System.out.println("I am SleepinZzzzzz....");
      }
      public void speak()
      {
        System.out.println("Hi Monkey.....");
      } 
      public static void main(String[]args)
      {
        BasicAnimal b=new Human();
                    b.eat();
                    b.sleep();
         Monkey m=new Human();
                m.speak();
                    
      }
}