import java.util.*;
import java.io.*;
public class DuplicatePairs {

	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String S=sc.next();
		String s="";
		S=S.trim();
		int count=0;
		for(int i=0; i<S.length();i++)
		{
			char p=S.charAt(i);
			for(int j=0;j<S.length();j++)
			{	
				if(p==S.charAt(j))
				{
					count++;
				}
			}
			int flag;
			if(count==2)
			{ 
				flag=0;
			  for(int j=0;j<s.length();j++)
			  {
				  if(p==s.charAt(j))
				  {	  flag=1;
					  break;
				  }
			  }
				  if(flag==0)
					  s=s+p;		
			}
			count=0;
		}
		System.out.print(s);	
	}
	}
