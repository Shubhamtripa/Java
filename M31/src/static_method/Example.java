package static_method;

public class Example {
	
static void Demo() {
	System.out.println("Static Method Demo()");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main start");
Demo();
Example.Demo();
System.out.println("main end");
	}

}
