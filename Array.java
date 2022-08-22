import java.util.Arrays;

public class Array
{
	public void positionOfArray(int []a)
	{
		int temp=10;
		for(int i=0;i<a.length;i++)
		{
				if(a[i]==10)
				{
					System.out.println("Element is in "+i +" th position in array");
				}
			
		}
	}

	public static void main(String s[])
	{
		int a[]= {1,20,30,10,50};
		System.out.println("Original array : "+Arrays.toString(a));
		Array arr=new Array();
		arr.positionOfArray(a);
	}
}
