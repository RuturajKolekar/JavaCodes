package Oops;


class Animal
{
	   String name;
	   String color;
	   String breed;
           double age;
       void dogInfo(String a,String b,String c,double d)
       {
           name=a;
           color=b;
           breed=c;
           age=d;
           System.out.println("The Info Of 1st dog is: \n"+a+"\n"+b+"\n"+c+"\n"+d+"\n");
       }
       public static void main (String[]args)
       {
          Animal dog1=new Animal();
          dog1.dogInfo("Jimmy","Reddish","PitBull",2.8);
          System.out.println(dog1.name+" "+dog1.color+" "+dog1.breed+" "+dog1.age);  
          Birds sp=new Birds();
          sp.fly("Sparrow");
          System.out.println(Birds.name);
       }
}
class Birds
{
      static String name;
      void fly(String a)
      {
         name=a;
         System.out.println(a+" Can fly"); 
      }
}