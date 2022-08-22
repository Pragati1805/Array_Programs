import java.util.Arrays;

public class ExchangeMid
{		
	public void exchangeMid(int a[],int mid)
{
		for(int i=0;i<mid;)
		{
			for(int j=mid;j<a.length;j++)
		{
			if(i<=mid && j>=mid)
			{
				int t=a[i];
				a[i]=a[j+1];
				a[j+1]= t;
				i++;
			}

		}
	System.out.println(Arrays.toString(a));
		}

}
	public static void main(String[] args) 
			{
				ExchangeMid e=new ExchangeMid();
				int a[]= { 2,9,4,3,11,9};
				System.out.println(Arrays.toString(a));
				int lower=0;
				int upper=a.length-1;
				int mid=(lower+upper)/2;
				System.out.println(a[mid]);
				e.exchangeMid(a, mid);
			}

	

	}


