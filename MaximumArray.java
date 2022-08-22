import java.util.Scanner;
public class MaximumArray
{
	public void maxValue(int[]a)
	{
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
		if(a[i]>max)
		max=a[i];
		}
		System.out.println("Maximum Value In Array is : "+max);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		MaximumArray max=new MaximumArray();
		System.out.println("Enter lenghth of array : ");
		int len=sc.nextInt();
		System.out.println("Enter Value of array : ");
		int a[]=new int[len];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		max.maxValue(a);
	}

}
