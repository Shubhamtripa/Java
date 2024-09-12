package collecton;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class All_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a = new ArrayList();
a.add(10);
a.add("TEN");

LinkedList l = new LinkedList();
l.add(20);
l.add("twenty");

Vector v = new Vector();
v.add(30);
v.add("tharty");

System.out.println("Arraylist: "+a);
System.out.println("Linkedlist: "+l);
System.out.println("Vector: "+v);

LinkedList l1 = new LinkedList(v);//linkedList constructor
System.out.println("L1 list: "+l1);
 
a.addAll(l);//Another way of adding constructor
System.out.println("a and l constructor is added: "+a);

ArrayList<Character> a2 = new ArrayList<Character>();//it is generalized by Character
a2.add('A');
a2.add('B');
a2.add('C');
System.out.println("Arraylist2 for character only: "+a2);


	}

}
