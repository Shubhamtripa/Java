package inheritance;

public class Son extends Father {
static String name="Smith";
void sondata() {
	System.out.println("Father's name: "+super.name);
}
Son(){
	System.out.println("from child.");
}
}

