package assignment5;
import java.util.*;
public class solEMPLOYEE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The No OF Employees");
		int n=sc.nextInt();
		EMPLOYEE emp[]=new EMPLOYEE[n];
		
		for(int i=0;i<n;i++)
		{
			sc.nextLine();
			System.out.println("Enter Employee Id=");
			String Eid=sc.nextLine();
			System.out.println("Enter Employee Name=");
			String EmpName=sc.nextLine();
			System.out.println("Enter Employee Age=");
			int age=sc.nextInt();
			System.out.println("Enter Employee Salary=");
			float salary=sc.nextFloat();
			sc.nextLine();
			System.out.println("Enter Employee Designation=");
			String designation=sc.nextLine();
			System.out.println("Is The Employee Permanent???");
			boolean isPermanent=sc.nextBoolean();
			
			 emp[i]=new EMPLOYEE(Eid,EmpName,age,salary,designation,isPermanent);
		}
		
     EMPLOYEE empId[]=findEmployeeById(emp,"E01");
     System.out.println("Emploee is=>");
     for(EMPLOYEE i :empId)
     {
    	 System.out.println(i.getEmpName());
     }
     
     EMPLOYEE updateSalary[]=updateSalary("NIL",67000,emp);
     System.out.println("Updated Employee Is=>");
     for(EMPLOYEE update:updateSalary)
     {
    	 System.out.println("Updated Employee Name= "+update.getEmpName()+"\n Updated Employee's Salary="+update.getSalary());
     }
     
     EMPLOYEE deductSalary[]=deductSalary("RAJ",7000,emp);
     System.out.println("Deducted Employee Is=>");
     for(EMPLOYEE deduct:deductSalary)
     {
    	 System.out.println(" Deducted Employee Name= "+deduct.getEmpName()+"\n Deducted Employee's Salary="+deduct.getSalary());
     }
     
     int avgAge=getAvgAge(emp);
     System.out.println("Average Age Of The  Employees Is=>"+avgAge);
     
     int maleAvgAge=getMaleAvgAge(emp);
     System.out.println("Average Age Of The Male Employees Is=>"+maleAvgAge);
     
     EMPLOYEE findMaxSal[]=findMaxSalaryOfAnEmployee(emp);
     System.out.println("MAXIMUM Salary =>");
     for (EMPLOYEE max:findMaxSal)
     {
    	 System.out.println("Employee Id=> "+max.getEmpId()+"\nEmployee Name=> "+max.getEmpName()+"\nEmployee Age=> "+max.getAge()+"\nEmployee Salary=> "+max.getSalary()+"\nEmployee Designation=> "+max.getDesignation());
     }
     
     EMPLOYEE findMinSal[]=findMinSalaryOfAnEmployee(emp);
     System.out.println("MINIMUMSalary =>");
     for (EMPLOYEE min:findMinSal)
     {
    	 System.out.println("Employee Id=> "+min.getEmpId()+"\nEmployee Name=> "+min.getEmpName()+"\nEmployee Age=> "+min.getAge()+"\nEmployee Salary=> "+min.getSalary()+"\nEmployee Designation=> "+min.getDesignation());
     }
     
     EMPLOYEE sortAge[]=sortEmployeeBasedOnAge(emp);
     System.out.println("Sorted By Age=>");
     for(EMPLOYEE empAge :sortAge)
     {
    	 System.out.println("Employee Name=> "+empAge.getEmpName()+" \nEmployee Age=> "+empAge.getAge());
     }
     
     EMPLOYEE getDetails[]=getDetailsOfAnEmployee(emp);
     System.out.println("Employee Details=>");
     for(EMPLOYEE det :getDetails)
     {
    	 System.out.println("Employee Name=> "+det.getEmpName()+" \nEmployee Age=> "+det.getAge());
     }
     
     EMPLOYEE getAge2[]=getfindEmployeesMoreThanAvgAge(emp,avgAge);
     System.out.println("Age Greater Than AVGAGE");
     for(EMPLOYEE e:getAge2)
     {
    	 System.out.println(e.getEmpName());
     }
	}

	


	public static EMPLOYEE[] findEmployeeById(EMPLOYEE emp[],String eId)
	{
		int index=0,i1,j;
		for(int i=0;i<emp.length;i++)
		{
			if((emp[i].getEmpId()).equals(eId))
			{
				index++;
			}
		}
		EMPLOYEE e[]=new EMPLOYEE[index];
		for(j=0,i1=0;i1<emp.length;i1++)
		{
			if((emp[i1].getEmpId()).equals(eId))
			{
				e[j]=new EMPLOYEE(emp[i1].getEmpId(),emp[i1].getEmpName(),emp[i1].getAge(),emp[i1].getSalary(),emp[i1].getDesignation(),emp[i1].PermanentEmployee);
			}
		}
		return e;
	}
    public static EMPLOYEE[] updateSalary(String name,double salary,EMPLOYEE[] emp)
    {
    	int index=0,i,j;
    	for(int i1=0;i1<emp.length;i1++)
    	{
    		if(emp[i1].getEmpName().equals(name))
    		{
    			index++;
    		}
    	}
    	EMPLOYEE update[]=new EMPLOYEE[index];
    	for(j=0,i=0;i<emp.length;i++)
    	{
    		if(emp[i].getEmpName().equals(name))
    		{
    			
    			update[j]=new EMPLOYEE(emp[i].getEmpId(),emp[i].getEmpName(),emp[i].getAge(),emp[i].getSalary(),emp[i].getDesignation(),emp[i].PermanentEmployee);
    			update[j].setSalary(salary);
    		}
    	}
    	return update;
    }
    public static EMPLOYEE[] deductSalary(String name,double salary,EMPLOYEE[] emp)
    {
    	int index=0,i,j;
    	for(int i1=0;i1<emp.length;i1++)
    	{
    		if(emp[i1].getEmpName().equals(name))
    		{
    			index++;
    		}
    	}
    	EMPLOYEE deduct[]=new EMPLOYEE[index];
    	for(j=0,i=0;i<emp.length;i++)
    	{
    		if(emp[i].getEmpName().equals(name))
    		{
    			
    			deduct[j]=new EMPLOYEE(emp[i].getEmpId(),emp[i].getEmpName(),emp[i].getAge(),emp[i].getSalary(),emp[i].getDesignation(),emp[i].PermanentEmployee);
    			deduct[j].setSalary(salary);
    		}
    	}
    	return deduct;
    }
    public static int getAvgAge(EMPLOYEE emp[])
    {
    	int age=0;
    	for(int i=0;i<emp.length;i++)
    	{
    		age+=emp[i].getAge();
    	}
    	return (age/emp.length);
    }
    public static int getMaleAvgAge(EMPLOYEE emp[])
    {
    	int age=0,index=0;
    	for(int i=0;i<emp.length;i++)
    	{
    		if(emp[i].designation.equals("MALE"))
        	{
        		age+=emp[i].getAge();
        		index++;
        	}
    	}
    	return (age/index);
    }
    public static EMPLOYEE[] findMaxSalaryOfAnEmployee(EMPLOYEE emp[])
    {
    	int index=1,i,j;
//    	for(int i1=0;i1<emp.length-1;i1++)
//    	{
//    		if(emp[i1].getSalary() > emp[i1+1].getSalary())
//    		{
//    			index++;
//    		}
//    	}
    	EMPLOYEE max[]=new EMPLOYEE[index];
    	for(j=0,i=0;i<emp.length-1;i++)
    	{
    		if(emp[i].getSalary() < emp[i+1].getSalary())
    		{
    			EMPLOYEE t=emp[i];
    			emp[i]=emp[i+1];
    			emp[i+1]=t;
    		} 
    		max[j]=new EMPLOYEE(emp[i].getEmpId(),emp[i].getEmpName(),emp[i].getAge(),emp[i].getSalary(),emp[i].getDesignation(),emp[i].PermanentEmployee);
    	}
    	return max;
    }
    public static EMPLOYEE[] findMinSalaryOfAnEmployee(EMPLOYEE emp[])
    {
    	int index=1,i,j;
//    	for(int i1=0;i1<emp.length-1;i1++)
//    	{
//    		if(emp[i1].getSalary() < emp[i1+1].getSalary())
//    		{
//    			index++;
//    		}
//    	}
    	EMPLOYEE min[]=new EMPLOYEE[index];
    	for(j=0,i=0;i<emp.length-1;i++)
    	{
    		if(emp[i].getSalary() > emp[i+1].getSalary())
    		{
    			EMPLOYEE t=emp[i];
    			emp[i]=emp[i+1];
    			emp[i+1]=t;
    			
    		    
    		} 
    		min[j]=new EMPLOYEE(emp[i].getEmpId(),emp[i].getEmpName(),emp[i].getAge(),emp[i].getSalary(),emp[i].getDesignation(),emp[i].PermanentEmployee);
    	}
    	return min;
    }
    public static EMPLOYEE[] sortEmployeeBasedOnAge(EMPLOYEE emp[])
    {
    	int i,j;
//    	for(int i1=0;i1<emp.length;i1++)
//    	{
//    		index++;
//    	}
    	
    	for(i=0;i<emp.length;i++)
    	{
//    		EMPLOYEE e[]=new EMPLOYEE[emp.length];
    		for(j=0;j<emp.length-i-1;j++)
    		{
    			if(emp[j].getAge()>emp[j+1].getAge())
    			{
    				EMPLOYEE t=emp[j];
    				emp[j]=emp[j+1];
    				emp[j+1]=t;
    			}
    		}
    	}
    	return emp;
    }
    public static EMPLOYEE[] getDetailsOfAnEmployee(EMPLOYEE emp[])
    {
    	int index=0,i,j;
    	for(int i1=0;i1<emp.length;i1++)
    	{
    		if(emp[i1].getSalary()>25000 && emp[i1].isPermanentEmployee()==true)
    		{
    			index++;
    		}
    	}
    	EMPLOYEE det[]=new EMPLOYEE[index];
    	for(j=0,i=0;i<emp.length;i++)
    	{ 
    		if(emp[i].getSalary()>25000 && emp[i].isPermanentEmployee()==true)
    		{
    			det[j]=new EMPLOYEE(emp[i].getEmpId(),emp[i].getEmpName(),emp[i].getAge(),emp[i].getSalary(),emp[i].getDesignation(),emp[i].PermanentEmployee);
        		j++;
    		}		
    	}
    	return det;
    }
    public static EMPLOYEE[] getfindEmployeesMoreThanAvgAge(EMPLOYEE emp[],int AvgAge)
    {
    	int index=0,i,j;
    	for(int i1=0;i1<emp.length;i1++)
    	{
    		if(emp[i1].getAge()>AvgAge)
    		{
    			index++;
    		}
    	}
    	EMPLOYEE find[]=new EMPLOYEE[index];
    	for(j=0,i=0;i<emp.length;i++)
    	{
    		if(emp[i].getAge()>AvgAge)
    		{
    			find[j]=new EMPLOYEE(emp[i].getEmpId(),emp[i].getEmpName(),emp[i].getAge(),emp[i].getSalary(),emp[i].getDesignation(),emp[i].PermanentEmployee);
        		j++;
    		}
    	}
    	return find;
    }
}
