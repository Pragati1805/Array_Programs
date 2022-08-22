import java.util.Scanner;
public class OddNo 
{
	int i;
	public void oddNo(int [] a)
	{
		for(i=0;i<a.length;i++)
		{
		if(a[i]%2!=0)
		{
			System.out.print("Odd no :  "+a[i] + " ");
		}
		else
			System.out.print("Even No  : "+a[i] + " ");
		}
	}
	public static void main(String[] args) 
	{
		int a[];
		Scanner sc=new Scanner(System.in);
		OddNo o=new OddNo();
		
		System.out.println("Enter length of array");
		
		int len=sc.nextInt();
		
		System.out.println("Enter array numbers");
		a=new int[len];
		
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
		
		}
		o.oddNo(a);
	}

}
