/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char ch=s.next().charAt(0);
		int m=s.nextInt();
		if(n>=0 && m>=0)
		{
			if(ch=='/')
			{
				System.out.println(n/m);
			}
			else if(ch=='%')
			{
				System.out.println(n%m);
			}
			else
			{
				System.out.println("Invalid Operator");
			}
		}
		else
		{
			System.out.print("Invalid Inputs");
		}
	}
}
