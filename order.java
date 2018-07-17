import java.util.Arrays;


public class order {
	public static void main(String args[])
	{ 	int i;
		String s="gftr43$%DytrrDT5";
		String s1="",s2="",s3="",s4="";
		for( i=0;i<s.length();i++)
		{
			char p=s.charAt(i);
			if((int)p>=65 && (int)p<=90)
				s1=s1+p;
			else if((int)p>=97 && (int)p<=122)
				s2=s2+p;
			else if((int)p>=48 && (int)p<=57)
				s3=s3+p+",";	
			else{s4=s4+p;}
		}
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		String s5[]=s3.split(",");
		int a[]=new int[s5.length];
		for(i=0;i<s5.length;i++)
		 a[i]=Integer.parseInt(s5[i]);
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		Arrays.sort(a);
		for(i=0;i<ch1.length;i++)
		System.out.print(ch1[i]);
		for(i=0;i<ch2.length;i++)
			System.out.print(ch2[i]);
		for(i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.print(s4);
	}}
