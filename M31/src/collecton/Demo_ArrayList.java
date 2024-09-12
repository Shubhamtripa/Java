package collecton;

import java.util.ArrayList;

public class Demo_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList l1 =new ArrayList();
l1.add(10);
l1.add(20.5);
l1.add(null);
l1.add("java");
l1.add(null);
l1.add(100);
System.out.println(l1.size());
System.out.println(l1.get(3));
System.out.println(l1.remove(2));
System.out.println(l1.isEmpty());
l1.clear();
System.out.println(l1);
	}

}
