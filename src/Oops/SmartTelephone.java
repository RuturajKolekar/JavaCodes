package Oops;


abstract class Telephone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone
{
       void ring()
       {
          System.out.println("Ringing....");
       }
       void lift()
       {
          System.out.println("Picking a call....");
       }
       void disconnect()
       {
          System.out.println("Disconnecting a call....");
       }
       void camera()
       {
         System.out.println("Taking a Snap!");
       }
       public static void main(String[]args)
       {
         Telephone t=new SmartTelephone();
                   t.ring();
                   t.lift();
                   t.disconnect();
    SmartTelephone t2=new SmartTelephone();
                   t2.camera();
                   
       }
}