package Array;


class ArrysPracticeSet6
{

     public static void main (String[]args)
     {
              int [] [] flats={{101,102,103},{104,105,106}};
              int i,j;
            
              int max=Integer.MIN_VALUE;
              for(i=0;i<flats.length;i++)
              { 
                  for(j=0;j<flats[i].length;j++) 
                  {
                     if(flats[i][j]>max)
                     {
                       max=flats[i][j];
                     }
                  }
              } 
              System.out.println("The Max Number In This Arry Is: " + max);
            
     }
}
