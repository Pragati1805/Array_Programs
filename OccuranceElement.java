
public class OccuranceElement
{
	public void occur(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			if(a[i]==-9999)
				continue;

			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j])
				{
				count++;
				a[j]=-9999;

				}
			}
			System.out.println("element "+a[i] +"="+ count + " times");
		}		
	}

	public static void main(String[] args)
	{
		OccuranceElement o=new OccuranceElement();
		int a[]= {7,9,5,4,3,6,4,1,9};
		o.occur(a);
		
		
		
	}

}
