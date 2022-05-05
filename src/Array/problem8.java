package Array;


 class ArrysPracticeSet8
{

     public static void main (String[]args)
     {
          int []flats={1,2,3,4,1,6};
           boolean issorted=true;
          for(int i=0;i<flats.length-1;i++)
          { 
             if(flats[i]>flats[i+1])
             { 
              issorted=false;
               break;
             }
          }
             if( issorted==true)
             {
               System.out.println("The Arry Is Sorted");
             }
             else
             {
                 System.out.println("The Arry Is Not Sorted");
             }  
     }
}             