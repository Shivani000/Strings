/* 21. INPUT1= helloworld
   INPUT2= 2. delete the char,if rpted twice.
   if occurs more than twice,leave the first occurence and delete the 
duplicate
   O/P= helwrd;
*/

import java.util.*;
class StringsPro21
{
		
	public static void main(String args[])
	{	
		int c=0;
		
		//Scanner sc=new Scanner(System.in);
		String s="hello world";
		char ch[]=new char[s.length];
		ch[]=s.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length-1;i++)
		{
			System.out.print(ch[i]);
		}
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==c[i+1])
			{
				c++;
			}
			
		}
		if(c>2)
			//t=t+s.charAt(i);
		else
			t=t+s.charAt(i);
		//System.out.println(t);
		
	}
}