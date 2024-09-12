package ojects;

public class Cons_OverLoadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cons_OverLoad c1=new Cons_OverLoad();
System.out.println("no argument");
System.out.println(c1.sid);
System.out.println(c1.name);
System.out.println(c1.age);

Cons_OverLoad c2=new Cons_OverLoad(10,12);
System.out.println(c2.sid);
System.out.println(c2.name);
System.out.println(c2.age);

Cons_OverLoad c3=new Cons_OverLoad(101,"Shubham",25);
System.out.println(c3.sid+c3.name+c3.age);

	}

}
