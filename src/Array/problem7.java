package Array;


class ArrysPracticeSet7
{

     public static void main (String[]args)
     {
              int [] [] flats={{101,102,103},{104,105,106}};
              int i,j;
              
              int min=Integer.MAX_VALUE;
              for(i=0;i<flats.length;i++)
              { 
                  for(j=0;j<flats[i].length;j++) 
                  {
                     if(flats[i][j]<min)
                     {
                       min=flats[i][j];
                     }
                  }
              } 
              System.out.println("The min Number In This Arry Is: " + min);
            
     }
}
