package codeWithHarry;


class Myid 
{
   private int id;
   private String name;
   void setName(String a)
   {
     this.name=a;
   }
   void setId(int b)
   {
     this.id=b;
   }
   String getName()
   {
     return name;
   }
   int getId()
   {
     return id;
   }
  public static void main(String[]args)
  {
     Myid e1 =new Myid() ;
      e1.setId(101);
      System.out.println(e1.getId());
      e1.setName("Ruturaj");
      System.out.println(e1.getName());
      
     
  }
}