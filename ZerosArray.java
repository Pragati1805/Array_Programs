import java.util.Arrays;

public class ZerosArray 
{
	public void arrayZero(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}

			}
		}
		System.out.println(Arrays.toString(a));

	}
	
	public static void main(String[] args) 
	{
		ZerosArray z=new ZerosArray();
		int a[]= {7,0,2,3,0,0,2,1};
		
		System.out.println("Original Array : "+Arrays.toString(a));
		z.arrayZero(a);
		
	}

}
