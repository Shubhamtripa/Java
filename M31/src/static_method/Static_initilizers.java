package static_method;

public class Static_initilizers {
static {
	System.out.println("from static block 1");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("from main");
	}
static {
	System.out.println("from static block 2");
}

}
