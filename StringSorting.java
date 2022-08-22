import java.util.Arrays;
import java.util.Scanner;

public class StringSorting
{

	public void sortString(String []a)
		{
			for(int i=0;i<a.length-1;i++)
			{
				for(int j=0;j<a.length-1-i;j++)
				{
					if(a[j].length()<a[j+1].length())
					{
						String t=a[j];
						a[j]=a[j+1];
						a[j+1]=t;
					}
					else
						if(a[j].length()==a[j+1].length())
						{
							if(a[j+1].compareTo(a[j])<0)
							{
								String s=a[j+1];
								a[j+1]=a[j];
								a[j]=s;
							}
						}
				}
			}
			System.out.println(Arrays.toString(a));
			

		}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			StringSorting s=new StringSorting();
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
