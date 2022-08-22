
public class PayRoll
{
public void showHighestSalary(EmployeeArray []e)
		{
		int hSal=Integer.MIN_VALUE;
		int hIndex = 0;
	
		for(int i=0;i<e.length;i++)
		{
			if(e[i].eSal>hSal)
			{
				hSal=e[i].eSal;
				hIndex=i;

			}

		}
		System.out.println("Employee with Highest Salary : "+e[hIndex]);

		for(int i=0;i<e.length;i++)
		{
			if(e[i].eSal==hSal)
			{
				hSal=e[i].eSal;
				hIndex=i;

			}
		}
		System.out.println("Employee with Highest Salary : "+e[hIndex]);

	}
	
	


	public static void main(String[] args) 
	{
		int eId,Esal;
		String name;
	EmployeeArray e[]=new EmployeeArray[5];
	e[0]=new EmployeeArray(1,10000,"XYZ");
	e[1]=new EmployeeArray(2,50000,"ABC");
	e[2]=new EmployeeArray(3,30000,"LMN");
	e[3]=new EmployeeArray(4,40000,"ZXC");
	e[4]=new EmployeeArray(5,50000,"AMK");
	PayRoll p=new PayRoll();
	p.showHighestSalary(e);


	}
	
}


