package codeWithHarry;


class Emp
{
     int emp_id;
     String emp_name;
     int salary;
     String company="Accenture";
      public Emp ( int emp_id,String emp_name, int salary)
      {
         this.emp_id=emp_id;
         this.emp_name=emp_name;
         this.salary=salary;
         this.display();
         test(this);
      }
      public Emp ()
      {
       this(101,"Ruturaj",24);
       emp_id=102;
       emp_name="Sagar";
       salary=12;
       Emp1 b=new Emp1(this);
       this.display();
       
       }
       public void display()
       {
         System.out.println(emp_id+" "+emp_name+" "+salary+" "+company); 
       } 
       public void test(Emp e2)
       {
         System.out.println("Emp_id= "+emp_id+"\n"+"emp_name= "+emp_name+"\n"+"salary= "+salary+"\n"+"Company= "+company);
       }
     public static void main(String[]args)
     {
        Emp e1=new Emp();
     }
}

class Emp1
{
   
     String company="DevOps";
     public Emp1(Emp b)
    {
     System.out.println("Emp_id= "+b.emp_id+"\n"+"emp_name= "+b.emp_name+"\n"+"salary= "+b.salary+"\n"+"Company= "+company);
    }
    public static void main(String[]args)
    {
         Emp a=new Emp();
    }
}