package collecton;

import java.util.LinkedHashSet;
public class D_Linked_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<String> lhs = new LinkedHashSet<String>();//it is generalized as "String"
lhs.add("java");
lhs.add("python");
lhs.add("web");
lhs.add("java script");
System.out.println(lhs);
//now in foreach loop we can use either Object reference or we can use the datatype which is 
//generalized.
System.out.println("For each loop with datatype used while generalizing.");
for(String subject : lhs) {
	System.out.println(subject);
}
System.out.println("For each loop with Object.");
for(Object obj: lhs) {
	System.out.println(obj);
}
	}

}
