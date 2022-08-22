import java.util.Scanner;
public class AltenateElement 
{
	public void oddElement(int a[])
	{
		int counter=1;
		for(int x : a)
		{
			if(counter%2!=0)
			{
				System.out.println( " Second Element from array  "+x);
				//System.out.println( x+ " ");
			}
			counter++;
		}
	}
	
	public static void main(String[] args)
	{
		AltenateElement o=new AltenateElement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Array : ");
		int len=sc.nextInt();
		System.out.print("Enter Elements of Array : ");
		int a[]=new int[len];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		o.oddElement(a);
		
	}
	

}
