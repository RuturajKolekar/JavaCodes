package Oops;


class X
{
      X() 
     {
         System.out.println("I am Default Constructor of X");
     }
     X(int a,int b) 
     {
         System.out.println("I am Parametrised Constructor of X: " +a);
     }
}
class Y extends X
{
     Y()
     {
        System.out.println("I am Default Constructor of Y");
     }
     Y(int a)
     {
        System.out.println("I am Parametrised Constructor of Y: "+a);
     }
     Y(int a,int b)
     {
        super(a,b);
        System.out.println("I am Paramerised Constructor of Y: "+b);
     }
     

}
class Z extends Y
{
      Z()
     {
         System.out.println("I am Default Constructor of Z");
     }
      Z(int a,int b,int c) 
     {
         super(a,b);
         System.out.println("I am Parametrised Constructor of Z: " +c);
     }
     public static void main(String[]args)
     {
       Z z=new Z(10,20,30);
       
     
     }
}	