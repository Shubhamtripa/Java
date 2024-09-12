package exception;

public class Nested_Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a=10;
	int b=0;
try
{
	System.out.println(a+b);
	try
	{
		System.out.println(a/b);
	}
	catch(Exception e)
	{
		System.out.println("1st catch");
	}
}
catch(Exception e)
{
	System.out.println("2nd catch");
}
	}
}
