package collecton;

import java.util.ArrayList;

public class D_ForEach_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList l =new ArrayList();
l.add(10);
l.add('s');
l.add(null);
l.add("shu");
l.add(50);
System.out.println(l);

for(Object i : l) {// Object is used to access every type of elements
	System.out.println(i);
}
	}

}
