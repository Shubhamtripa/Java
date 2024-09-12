package collecton;

import java.util.LinkedHashMap;

public class D_Linked_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer, String>();
lhm.put(10, "java");
lhm.put(20, "SQL");
lhm.put(30, "Web");
System.out.println(lhm);
System.out.println(lhm.get(20));
	}

}
