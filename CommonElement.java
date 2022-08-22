
public class CommonElement 
{
	public void common(int[]a,int []b)
	{
		int count=0;
	for(int x : a)
	{
		for(int y: b)
		{
		if(x==y)
		{
			count++;
			System.out.println("Common Element "+x);
		}
		
		}
		
	}
	System.out.println("There are "+count+" Elements common");
	
	}
	public static void main(String[] args)
	{
		CommonElement c=new CommonElement();
		int a[]= {10,20,30,40,50};
		int b[]= {20,70,80,90,10};
		c.common(a, b);
		

	}

}
