package exception;

public class Demo4_throws {
 
public static void add() throws ArithmeticException{
	System.out.println("ADD Start");
	System.out.println(10/0);
	System.out.println("ADD Ends.");
}
public static void main(String[] args) {
	System.out.println("Main Start");
	try {
		add();
	}
	catch(ArithmeticException e) {
		System.out.println("Handled");
	}
	System.out.println("Main Ends.");
}
}
