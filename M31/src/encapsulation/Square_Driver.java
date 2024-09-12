package encapsulation;

import java.util.Scanner;

public class Square_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 =new Square();
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number: ");
		int a=sc.nextInt();
		s1.setsquare(a);
		System.out.println(s1.getsquare());
	}

}
