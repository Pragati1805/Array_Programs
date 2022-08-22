import java.util.Arrays;
import java.util.Scanner;

public class TwoArray 
{
	public void displayArray(int [][]b)
	{
		for(int r=0;r<b.length;r++)
		{
		for(int c=0;c<b[r].length;c++)
		{	
			System.out.print(b[r][c] + " ");
		}
	
		System.out.println();
		}
	}
	public void addRows(int b[][])
	{
		for(int r=0;r<b.length;r++)
		{
			for(int c=0;c<r;c++)
			{
				
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	//int b[][]= {{1,2},
		//	{2,5,8},
			//{8,9,6,10}};
		System.out.println("How many Rows do u want ..?");
		int r=sc.nextInt();
		System.out.println("How many Column do u want...?");
		int c=sc.nextInt();
		//System.out.println("length of Array : "+b.length);
		int b[][]=new int[r][c];

		System.out.println("Please Enter Array elements : ");
		for( r=0;r<b.length;r++)
			{
			for(c=0;c<b[r].length;c++)
			{	
				b[r][c]=sc.nextInt();

			}
			}
		System.out.println("Array Elements Are : ");
		TwoArray t=new TwoArray();
		t.displayArray(b);
		
	
	}

	}


