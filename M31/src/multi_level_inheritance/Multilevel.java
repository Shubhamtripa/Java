package multi_level_inheritance;

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RightAngleTriangle t =new RightAngleTriangle(3, 4);
System.out.println("from shape:- Area: "+t.area);
t.compute_area();
System.out.println("From Triangle:- Base: "+t.base);
System.out.println("From Triangle:- Height: "+t.height);
t.display();
t.Display();

	}

}
