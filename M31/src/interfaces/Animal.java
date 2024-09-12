package interfaces;

public class Animal implements Animal_Eat,Animal_Travel {
//animal class is not abstract class
//but inheriting abstract method
//for that we are adding method body to avoid error
//we have to provide the implementation to all unimplemented methods(abstract method)
	
	public void travel() {
		System.out.println("Animal can travel.");		
	}

	public void eat() {
		System.out.println("Animal can Eat.");
	}

}
