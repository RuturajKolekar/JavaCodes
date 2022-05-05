package Methods;


class MethodsPracticeSet6
{
   static int avg(int ...arr)
   {
     int count=0;
     int sum=0;
     for(int b:arr) 
     {
      sum = sum+b;
      count++;
     }
      return sum/count;
   }

  public static void main (String[]args)
  {
      int c= avg(1,2,3,4,5);
       System.out.println("The Avg Of this Number is: "+c);
  }

} 