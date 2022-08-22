
public class EmployeeArray 
{
	int eId,eSal;
	String name;

	EmployeeArray()
	{
		
	}
	EmployeeArray(int i,int sal,String n)
	{
		eId=i;
		eSal=sal;
		name=n;
		
	}
	public String toString()
	{
		return "Id= "+eId + " salary ="+eSal +" Name = "+name;
	}
}
	