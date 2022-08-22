
public class CountNumber
{
	public void add(int[] a)
	{
		int sum=0;
		for(int x : a)
		{
			System.out.println(x);
			 sum=sum+x;
		}
		System.out.print("Addition of Array ="+sum );
	}
	public static void main(String[] args) 
	{
		CountNumber c=new CountNumber();
		
		int a[]= {1,10,50,40,30};
		
		c.add(a);
	}
}
