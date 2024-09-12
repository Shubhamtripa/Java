package non_Static;

import java.util.Scanner;

public class Square_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Square s1 =new Square();
Scanner sc =new Scanner(System.in);
System.out.println("enter number: ");
int a=sc.nextInt();
System.out.println(s1.square(a));
	}

}
