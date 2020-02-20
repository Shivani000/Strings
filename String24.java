/*
24. Input1=”cowboy”; Output1=”cowcow”;
    Input1=”so”;output1=”sososo”; 
    HINT: if they give 3 letter word u have to display 2 time;

*/
import java.util.Scanner;
class String24
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		if(n==2)
		{
			System.out.println(s+s+s);
		}
		else if(n>=3)
		{
			String s1=s.substring(0,3);
			System.out.println(s1+s1);
		}
	}
}