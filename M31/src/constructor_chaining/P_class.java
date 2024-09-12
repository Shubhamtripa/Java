package constructor_chaining;

public class P_class {
P_class(){
	System.out.println("NO Argument");
}
P_class(int i){
	this();
	System.out.println("Parameterised: "+i);
}
P_class(int i, char ch){
	this(50);
	System.out.println("two Parameters: "+i +ch);
}
}
