package exception;

import java.util.Scanner;

public class dummy {
	public static void main(String[] args) {
// after execution of if else block rest of the code will also executes.
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
					System.out.println("invalid Password");
				}
			}
		else {
				System.out.println("Invalid UserName");
			}
		System.out.println("skshfksegfshekjfslgja");
		}
	}