import java.util.Scanner;
public class Reverse 
{
	public void revArray(int[]a)
	{
		System.out.println("Original Array : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		for(int i=a.length-1;i>0;i--)
		{
			System.out.println("Reverse Array : ");
			System.out.print(a[i]+ " ");
		}
	}

	public static void main(String[] args)
	{
		Reverse r=new Reverse();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of Array : ");
		int len=sc.nextInt();
		System.out.println("Enter Array list : ");
		int a[]=new int[len];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
				
		r.revArray(a);
			
		

	}

}
