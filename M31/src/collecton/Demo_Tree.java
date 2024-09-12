package collecton;

import java.util.TreeSet;

public class Demo_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> t = new TreeSet<String>();
t.add("Banana");
t.add("cat");
t.add("Apple");
System.out.println(t);
System.out.println("===================================");
for(String s:t) {
	System.out.println(s);
}
	}

}
