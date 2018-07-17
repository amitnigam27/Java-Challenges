import java.util.*;
public class PasswordValidation 
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
	 if(s.length()>=6 && s.length()<=16)
	 {
		 if(s.equals(S))
		 {
			 System.out.println("Username and Password  must not be same");
		 }
		 else
		 {
			 if(s.matches(".*[A-Z].*")&&  s.matches(".*[a-z].*") &&  s.matches(".*[0-9].*"))
			 {
				 if(s.matches(".*[!@#$%^&*()].*"))
				 {
					 System.out.println("Password is correct");
				 }
				 else
				 {
					System.out.println("You have not chosen valid special character");
				 }
			}
			else
				{
					System.out.println("Please chose at least one capital letter, 1 small letter and 1 no.");	
				} 
			 
		 }
	 }
	 else
	 {
			System.out.println("Password length must be from 6 to 16 characters");
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
}
