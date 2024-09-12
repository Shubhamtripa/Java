package exception;

import java.util.Scanner;

public class Login {
public static void main(String[] args) {
//	after execution of try catch block rest of the code will not get executes.
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter User_Name: ");
	String username = sc.next();
	System.out.print("Enter Password: ");
	int password=sc.nextInt();
	if(username.equals("admin")) {
		if(password == 12345) {
			System.out.println("Login Sucessfully");
		}
		else {
			try {
				InvalidPasswordException e =new InvalidPasswordException();
				throw e;
			}
			catch(Exception e) {
				System.out.println("invalid Password");
			}
		}
	}
	else {
		try {
			InvalidPasswordException e =new InvalidPasswordException();
			throw e;
		}
		catch(Exception e) {
			System.out.println("Invalid UserName");
		}
	}
}
}
