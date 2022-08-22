import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
{
	public void selectionsort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int minindx=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[minindx])
					minindx=j;
			int t=a[minindx];
			a[minindx]=a[i];
			a[i]=t;
				
			}
		}
		System.out.println("After Sorting by Slection Sort : ");
		System.out.println(Arrays.toString(a));
					
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		SelectionSort s=new SelectionSort();
		System.out.println("Enter size of array : ");
		int len=sc.nextInt();
		System.out.println("Enter array elements : ");
		int a[]=new int[len];
		for(int i=0;i<a.length;i++)
		{
			 a[i]=sc.nextInt();
		}
			
		s.selectionsort(a);
	}

	}

