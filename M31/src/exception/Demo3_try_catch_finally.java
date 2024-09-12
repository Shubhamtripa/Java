package exception;

public class Demo3_try_catch_finally {
	public static void main(String[] args) {
		
	int a=10,b=0;//check here
	try {
		System.out.println(a/b);

		}
	catch(Exception e) {
		System.out.println("We can not divide number by zero.");
		e.printStackTrace();
	}
// each time finally block will execute 
finally {
	System.out.println("the end.");
}
	}
}
