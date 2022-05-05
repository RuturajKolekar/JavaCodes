package codeWithHarry;


class Employee2
{
       	int empid;
   	String empname;
	static String company="DevOps";
         Employee2(int empid,String empname)
         {
            this.empid=empid;
            this.empname=empname;       
         }
  	void display()
        {
          System.out.println(empid +" " + empname +" " + company); 
        }
           public static void main(String[]args)
           {
               Employee2 e1=new Employee2(101,"Ruturaj");
               e1.display();
                Employee2 e2=new Employee2(102,"Sagar");
               e2.display(); 
           }
} 