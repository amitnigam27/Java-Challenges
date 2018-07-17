
public class PrintEven 
{
public static void main(String args[])
	{ 
	int i,count=0;
	  for(i=100;i<=999;i++)
	  {
		  int p =i;
		  int d1=p%10;
		  int d2=p/100;
		  int d3=p/10;
		  int d4=d3%10;
		  if((d1+d2)==d4)
		  {
			   count++;
			  System.out.print(i+" ");
		  }
	  }
	  System.out.print("\n Total no. are "+count);
	}

}
