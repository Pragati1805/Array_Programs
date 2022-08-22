import java.util.Arrays;
import java.util.Scanner;

public class Sorting 
{
	public void sort(int[]a)
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
			System.out.println(Arrays.toString(a));

			System.out.println("After pass "+(i+1)+ " ");
			System.out.println(Arrays.toString(a));
			System.out.println("_________________________________________");


		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Sorting s=new Sorting();
		System.out.println("Enter size of array : ");
		int len=sc.nextInt();
		System.out.println("Enter array elements : ");
		int a[]=new int[len];
		for(int i=0;i<a.length;i++)
		{
			 a[i]=sc.nextInt();
		}
			
		s.sort(a);
	}
	
		
	}
	
		
	


