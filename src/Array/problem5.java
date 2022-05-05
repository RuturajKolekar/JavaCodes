package Array;


  class ArrysPracticeSet5
{

     public static void main (String[]args)
     {
          int []flats={1,2,3,4,5,6};
             int l=flats.length;
             int temp=0;
             int n=Math.floorDiv(l,2);
          for(int i=0;i<n;i++){
            temp= flats[i];
            flats[i]=flats[l-1-i];  
          flats[l-1-i]= temp;
         }
        for(int e:flats){
         System.out.print(e + " " );   
      }
   }
}
