import java.util.Scanner;
public class Minimum 
{
	public void min(int[] a)
	{
		int min;
		min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}

		}
		System.out.println("Minimum value in array is: "+min);

	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Minimum m=new Minimum();
		System.out.println("Enter length of array : ");
		int len=sc.nextInt();
		System.out.println("Enter array value : ");
		int a[]=new int[len];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		m.min(a);
	}

}
