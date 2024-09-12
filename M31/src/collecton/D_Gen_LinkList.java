package collecton;

import java.util.LinkedList;

public class D_Gen_LinkList {
public static void main(String[] args) {
	LinkedList<Integer> l1 = new LinkedList<Integer>();
	l1.add(10);
	l1.add(20);
	l1.add(null);
	//In generic LinkedList we only add elements same as we generalize.
//	l1.add("abc");
	System.out.println(l1);
}
}
