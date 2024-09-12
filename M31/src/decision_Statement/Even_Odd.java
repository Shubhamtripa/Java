package decision_Statement;
import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number:");
int a=sc.nextInt();
if(a%2==0) {
	System.out.println("Number is even.");
}
else
	System.out.println("Number is Odd.");

	}

}
