package collecton;

import java.util.ArrayList;

public class Demo2_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList l1 =new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
System.out.println(l1);
ArrayList l2 = new ArrayList();
l2.add(40);
l2.addAll(l1);
System.out.println(l2);
System.out.println(l2.containsAll(l1));
l2.removeAll(l1);
System.out.println(l2);
System.out.println(l2.containsAll(l1));

	}

}
