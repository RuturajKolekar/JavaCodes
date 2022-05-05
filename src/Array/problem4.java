package Array;


class ArrysPracticeSet4
{

     public static void main (String[]args)
     {
          	int [] [] flats={{101,102,103},{104,105,106}};
          	int [] [] rooms={{1,2,3},{4,5,6}};
         	int [] [] add={{0,0,0},{0,0,0}};
                int i,j;
        		for(i=0;i<flats.length;i++)
                        { 
             		   for(j=0;j<flats[i].length;j++)
                              {
                             add[i][j]=flats[i][j]+rooms[i][j];
                                 System.out.print(add[i][j]+"\t");
         		      }
                             System.out.println();
                         } 
                          
      }
}
