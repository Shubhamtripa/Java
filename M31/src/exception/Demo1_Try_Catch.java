package exception;

public class Demo1_Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=0;
try {
	System.out.println(a/b);

	}
catch(ArithmeticException e) {
	System.out.println("We can not divide number by zero.");
}

}
}