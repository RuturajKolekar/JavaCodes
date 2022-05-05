package Collection;



class ArrysPracticeSet{

        public static void main (String[]args){
         
         problem1();
          
      }
       public static void problem1(){
          
          int i;
           float sum=0;
          
         float [] runs={80,87,90,54,69};
         for(i=0;i<runs.length;i++){
             sum=sum+runs[i];
             System.out.println(runs[i]);
          }
           System.out.println("Sum of all arrys are: "+sum);
      }
     
       
}