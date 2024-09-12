package exception;

public class Demo2_try_catch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=0;
try {
	System.out.println(a/b);

	}
catch(Exception e) {
	System.out.println("We can not divide number by zero.");
	e.printStackTrace();
}

}
}
