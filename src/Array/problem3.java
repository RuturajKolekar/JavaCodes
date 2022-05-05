package Array;



class ArrysPracticeSet3{

     public static void main (String[]args){
         int sum=0;
         int [] physics={80,87,90,54,69};
           for(int d: physics){
              System.out.println(d);
               sum=sum+d;
             }    
           System.out.println("average of physics marks are: "+sum/physics.length);  
   }
}
