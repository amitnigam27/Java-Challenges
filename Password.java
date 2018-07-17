import java.util.*;
public class Password
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the username");
	 String S=sc.next();
	 S=S.trim();
	 System.out.println("Enter the password");
	 String s=sc.next();
	 s=s.trim();
	 
		 if(s.equals(S))
		 {
			 System.out.println("Username and Password  must not be same");
		 }
		 else
		 {
			 if(s.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{6,16}"))
			 {
				System.out.println("Password is corrwct");
			 }
			else
				{
					System.out.println("Please chose at least one capital letter, 1 small letter and 1 no.");	
				} 
			 
		 }
	 
	}
}
