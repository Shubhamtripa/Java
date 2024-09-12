package constructor_chaining;

public class C_class extends P_class{
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main start");
C_class c1 =new C_class();
	}

C_class(){
super(10,'M');	
System.out.println("end child");
	}

}
