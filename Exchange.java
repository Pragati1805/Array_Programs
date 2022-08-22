import java.util.Arrays;

public class Exchange
{
	public void change(int a[],int mid)
	{
		for(int i=0, j=a.length-1;j>0 ;j--)
			{
				if(i<mid && j>mid)
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
					i++;
				}

			}
		System.out.println(Arrays.toString(a));


		}
	
	public static void main(String[] args) 
	{
		Exchange e=new Exchange();
		int a[]= { 2,9,4,5,3,11,9};
		System.out.println(Arrays.toString(a));
		int lower=0;
		int upper=a.length-1;
		int mid=(lower+upper)/2;
		e.change(a, mid);
	}

}
