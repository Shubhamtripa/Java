package collecton;

import java.util.HashSet;

public class D2_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet h = new HashSet();
h.add(10);
h.add(2.45);
h.add('S');
h.add(65);
h.add("SHUBH");
h.add(89);
System.out.println(h);
for(Object obj: h) {
	System.out.println(obj);
}
	}

}
