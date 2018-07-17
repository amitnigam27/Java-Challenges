public class CharacterElimination 
{
public static void main(String args[])
{
String S="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
int n=S.length();
String s="";
String arr[]=new String[n];
int i,count;  
i=0; 
count=1;
int t=0;
int k=0;
while(i<n)
{
	int j=i+count;
	if(j<n)
	{
		for(int m=i;m<j;m++)
		{
			s=s+S.charAt(m);
		}
		arr[t]=s;
	}
	k=k+2;
	i=i+k;
	count++;
	t++;
	s="";
}
for(int a=0;a<t;a++)
{
	System.out.print(arr[a]+(a+1));	}
}
}