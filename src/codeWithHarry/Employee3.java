package codeWithHarry;


class Employee3
{
       	static int empid= 100;
          Employee3()
          {
             empid++;
          }
   	String empname;
	static String company="DevOps";
         Employee3(String empname)
         {
            
            this.empname=empname;       
         }
  	void display()
        {
          System.out.println(empid +" " + empname +" " + company); 
        }
           public static void main(String[]args)
           {
               Employee3 e1=new Employee3("Ruturaj");
               e1.display();
                Employee3 e2=new Employee3("Sagar");
               e2.display(); 
           }
}