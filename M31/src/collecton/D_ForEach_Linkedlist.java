package collecton;

import java.util.LinkedList;

public class D_ForEach_Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l1 = new LinkedList();
l1.add(10);
l1.add("shubh");
l1.add(30);

for (Object obj : l1) {
	System.out.println(obj);
}
	}

}
