package Oops;


class Mechanical
{
    private int rollNo;
    public void setRollNo(int a)
    {
        this.rollNo=a;
    }
    public int getRollNo()
    {
        return rollNo;
    }
}
class DivC extends Mechanical
{
  public static void main(String[]args)
  {
     DivC c=new DivC();
              c.setRollNo(101);
     System.out.println(c.getRollNo());
  }
}
