package Oops;


interface TvRemote
{
    void tvOn();
    void tvOff();
    static void greet()
    {
      System.out.println("Good Morning!");
    } 
    public static void main(String[]args)
     {
          greet();
     }
}
interface SmartTvRemote extends TvRemote
{
    void changeChannel();
    void lowerSound();
    void increseSound();
}
class Tv implements SmartTvRemote
{
     public void tvOn()
     {
       System.out.println("Turning On The Tv");
     }
     public void tvOff()
     {
       System.out.println("Turning Off The Tv");
     }
     public void changeChannel()
     {
       System.out.println("Changing The Tv Channel");
     }
     public void lowerSound()
     {
       System.out.println("Lowering The Tv Sound");
     }
     public void increseSound()
     {
       System.out.println("Increasing The Tv Sound");
     }
     public static void main(String[]args)
     {
                       
         SmartTvRemote s=new Tv();
                       s.tvOn();
                       s.tvOff();
                       s.changeChannel();
                       s.lowerSound();
                       s.increseSound();
           System.out.println("------------------------------");
              TvRemote t=new Tv();
                       t.tvOn();
                       t.tvOff();
                       
     }    
}