package Oops;


class Emp2
{
     int emp_id;
     String emp_name;
     int salary;
     String company="Accenture";
      public Emp2( int emp_id,String emp_name, int salary)
      {
         this.emp_id=emp_id;
         this.emp_name=emp_name;
         this.salary=salary;
         this.display();
         test(this);
      }
      public Emp2 ()
      {
       this(101,"Ruturaj",24);
       emp_id=102;
       emp_name="Sagar";
       salary=12;
       this.display();
       
       }
       public void display()
       {
         System.out.println(emp_id+" "+emp_name+" "+salary+" "+company); 
       } 
       public void test(Emp2 e2)
       {
         System.out.println("Emp_id= "+emp_id+"\n"+"emp_name= "+emp_name+"\n"+"salary= "+salary+"\n"+"Company= "+company);
       }
     public static void main(String[]args)
     {
       
     }
}

class Emp5 extends Emp2
{
    public static void main(String[]args)
    {
         Emp5 a=new Emp5();
          a.display();
          
    }
}