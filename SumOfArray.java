
public class SumOfArray 
{
	public void sum(int []a,int []b)
	{
		int add=0;
		for(int i=0;i<a.length;i++)
		{
											
				 add= a[i] +b[i];
				 System.out.println("Addition of two array : "+add );
	
		}	
		

	}

public static void main(String s1[])
{
	SumOfArray s=new SumOfArray();
	int a[]= {10,20,30,40,50};
	int b[]= {5,10,15,20,25};
	s.sum(a, b);
	
}
}