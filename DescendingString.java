import java.util.Arrays;
import java.util.Scanner;
public class DescendingString {
	
		public void sortString(String []a)
			{
			for(int i=0;i<a.length;i++)
			{
				int minindx=i;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j].length() > a[minindx].length())
						minindx=j;
				String t=a[minindx];
				a[minindx]=a[i];
				a[i]=t;
				}
			}
				System.out.println("After Sorting Array");
				System.out.println(Arrays.toString(a));

			}
			public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				DescendingString s=new DescendingString();
				System.out.println("Enter size of array : ");
				int len=sc.nextInt();
				System.out.println("Enter array elements : ");
				String a[]=new String[len];
				for(int i=0;i<a.length;i++)
				{
					 a[i]=sc.next();
				}
					
				s.sortString(a);
			}

		}
