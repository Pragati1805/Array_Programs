import java.util.Scanner;

public class ThirdChar {

	public void thirdChar(String str)
	{
	for(int i=0;i<str.length();i++)
	{
	char ch=str.charAt(i);
	ch+=3;
	System.out.print(ch);
	}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=sc.nextLine();
		ThirdChar c=new ThirdChar();
		c.thirdChar(str);
		
	}
}