package collecton;

import java.util.LinkedList;

public class Demo1_Linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l1 = new LinkedList();
l1.add(10);
l1.add(20);
l1.add(30);
System.out.println(l1);
for(int i =0;i<l1.size();i++) {
	System.out.println(l1.get(i));
}
	}

}
