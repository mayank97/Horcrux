package lab3;

import java.util.*;
public class Person 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Reading database file...");
		System.out.println("Network is ready.");
		
		Scanner n = new Scanner(System.in);
		int i = n.nextInt();
		
		System.out.println();
		
		while(i!=-1)
		{
			System.out.println("1. Sign up");
			System.out.println("2. Login");
			
			int j = n.nextInt();
			if (j==1)
			{
				System.out.println("Enter username");
				String username = n.next();
				System.out.println("Enter display name");
				String displayname = n.next();
				System.out.println("Enter password");
				String password = n.next();
				
				
				SignUp obj = new SignUp(username, displayname, password);	
				System.out.println("Registration is successful. User " + username + " created.");
				System.out.println();
			}
			else if(j==2)
			{
				System.out.println("Please enter your username: ");
				String username = n.next();
				System.out.println("Please enter your password: ");
				String password = n.next();
				
				Login log = new Login(username, password);
			}
		}
		
	}
}
