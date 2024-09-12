package static_method;

public class Static_Variable {
static String name ="Shubham";
static void display() {
	System.out.println("from display()  "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("from main  "+name);
display();
	}

}
