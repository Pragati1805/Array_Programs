import java.util.Arrays;
import java.util.Scanner;
public class ArrayHandling 
{
	public void makeArray(int arr[])
	
	{
		System.out.println("\n");

	}
	public void dispArray(String[] arr1)

	{
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i] +" ");

			
		}
		System.out.println("\n");

	}
	public void dispArray(float []arr3)
	{
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i] + " ");

		}
	}
	
	public static void main(String s[])
	{
		ArrayHandling ar=new ArrayHandling();
		//Scanner sc=new Scanner(System.in);
	//	System.out.print("Enter array length");
		//int arr[];
		//arr=new int[5];
		int arr []= {1,2,3,4,5,6,7,8,9,10};
		
		String arr1[]= {"a","b","c","d","e"};
		
		float arr3[]= {1.2f,2.3f,5.6f};
		/*System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter array Element : ");
			[i]=sc.nextInt();	
		}*/
		for(int x : arr) {
			System.out.print(x+ " ");
		}
		ar.makeArray(arr);
		ar.dispArray(arr1);
		ar.dispArray(arr3);
	}
}
