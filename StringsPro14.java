/*--------------------------------------------------------------
14. write a program:
input1=commitment;
  output=cmmitmnt;
c be the first index position 
remove even vowels from the string
*/

import java.util.*;
class StringsPro14
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String t="";
		int i;
		for(i=0;i<=s.length()-1;i++)
		{
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				{
					if((i+1)%2!=0)
					
					t=t+s.charAt(i);
				}
				else
				t=t+s.charAt(i);
		}
		System.out.println(t);
	}
}
