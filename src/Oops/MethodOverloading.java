package Oops;


class MethodOverloading
{
   
    static void status()
    {
       System.out.println("It's A Morning");
    }
    static void status(int a)
    {
       System.out.println("It's A Morning " + a);
    }
    static void status(int a,int b)
    {
       System.out.println("It's A Morning " + a +" & "+b);
    }
   void status(int a,int b,int c)
    {
       System.out.println("It's A  Same Morning");
    } 
    static void status(int [] arr)
    {
       arr[4]=52;
    }
     public static void main(String[]args)
     {
        MethodOverloading obj=new MethodOverloading();
        obj.status(1,2,3); 
        status();
        status(50);
        status(50,100);
        int[] marks={71,52,79,84,65};
        status(marks);
        System.out.println("Arry Should be changed "+marks[4]);
        
     }

}