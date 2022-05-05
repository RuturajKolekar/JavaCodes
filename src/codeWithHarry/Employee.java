package codeWithHarry;


class Employee
{
       	int empid;
   	String empname;
	String company;
         Employee(int empid,String empname,String company)
         {
            this.empid=empid;
            this.empname=empname;
            this.company=company;       
         }
  	void display()
        {
          System.out.println(empid +" " + empname +" " + company); 
        }
           public static void main(String[]args)
           {
               Employee e1=new Employee(101,"Ruturaj","DevOps");
               e1.display();
                Employee e2=new Employee(102,"Sagar","DevOps");
               e2.display(); 
           }
}