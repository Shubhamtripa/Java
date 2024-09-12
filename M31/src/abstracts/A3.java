package abstracts;

public abstract class A3 extends A1{
//Here A3 class is abstract because of that we don't have to provide implementation or override  
//the abstract methods of class A1
	
//	abstract class can have constructor
	A3(){
		
	}
	
//	We can make class abstract even if we don't have abstract methods 
	public void abc() {
		System.out.println("Concrete method ");
	}
	
//	variable can't be abstracted 
//	abstract int a;
}
