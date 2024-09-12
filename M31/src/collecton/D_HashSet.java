package collecton;

import java.util.HashSet;

public class D_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet h = new HashSet();
h.add(20);
h.add(20.67);
h.add(null);
h.add("java");
System.out.println("Size: "+h.size());
System.out.println(h);
for(Object obj : h) {
	System.out.println(obj);
}
	}

}
