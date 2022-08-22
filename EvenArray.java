import java.util.Arrays;

public class EvenArray
{
	public void even(int a[])
	{
		System.out.print("Even Array : ");

		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			
				System.out.print(a[i]+ " ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int a[]={7,10,20,5,9,80,90};
		System.out.println(Arrays.toString(a));
		EvenArray e=new EvenArray();
		e.even(a);

	}

}
