

public class HelloString 
{
	
	
	public static void main(String args[])
	{
		String str="Hello";
		int count = 0,i;
		for( i=0;i<str.length()-1;i++)
		{
		char ch=str.charAt(i);
		System.out.println(ch);
		if(ch=='l')
		{
		
			count++;
		}
		
		System.out.println("character l display at "+count +" times in "+i+ " position");

		}
		
	}
}
