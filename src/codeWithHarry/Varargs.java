package codeWithHarry;


class Varargs
{
     static int sum (int ...arr)
     {
             int result=0; 
             for (int a:arr)
             {
              result +=a; 
             }
             return result;
     }  
      public static void main(String[]args)
       {
      
           System.out.println("The Sum Of Given Numbers Is: " + sum(2,4,6,8,10));
       }

}