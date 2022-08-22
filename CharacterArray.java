import java.util.Arrays;
import java.util.Scanner;

public class CharacterArray 
{
	public void charSort(char ch[])
	
	{
		for( int i = 0;i<ch.length-1;i++)
		{
			for(int j=0;j<ch.length-1-i;j++)
			{
				char t=ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=t;
			}
		}
		System.out.println("After Sorting Descending Order Array : ");
		System.out.println(Arrays.toString(ch));
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		CharacterArray c=new CharacterArray();
		char ch[]= {'a','b','t','Z','A'};
		System.out.println("Array "+Arrays.toString(ch));
		
		
		c.charSort(ch);

	}
}
