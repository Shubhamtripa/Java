package encapsulation;
import java.util.Scanner;
public class ReactangleArea_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RectangleArea r1 = new RectangleArea();
Scanner sc =new Scanner(System.in);
System.out.println("enter length and breadth of rectangle.");
System.out.print("enter length is: ");
int a=sc.nextInt();
System.out.print("enter breadth is: ");
int b= sc.nextInt();
r1.setLength_breadth(a, b);
System.out.println("Area of Rectangle is: "+r1.getArea());
	}

}
