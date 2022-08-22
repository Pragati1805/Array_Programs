import java.util.Arrays;
import java.util.Scanner;

public class ReplaceNumber 
{
	public void replace(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%4==0)
			{
				a[i]=0;
			}
		}
		System.out.println("New Array "+Arrays.toString(a));

	}
	
	public static void main(String[] args) 
	{
		ReplaceNumber r=new ReplaceNumber();
		Scanner sc=new Scanner(System.in);
		int a[]= {7,9,2,3,4,3,2,1};
		
		System.out.println(Arrays.toString(a));
		r.replace(a);
		

	}

}
