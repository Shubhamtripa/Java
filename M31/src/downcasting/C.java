package downcasting;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a1 = new B();//up casting
a1.age=25;

/*a1.name;//can not access child class members from up casting
B b1 = new A();//wrong implementation  */

B b11= (B)a1;//Down casting  -- we can access both class members A & B.
b11.name="Shubham";
System.out.println(b11.age);
System.out.println(b11.name);
	}

}
