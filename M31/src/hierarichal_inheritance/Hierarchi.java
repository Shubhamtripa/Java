package hierarichal_inheritance;

public class Hierarchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c=new Circle(5);
System.out.println(c.area);
System.out.println(c.radius);

Square s = new Square(10);
System.out.println(s.area);
System.out.println(s.length);

Triangle t =new Triangle(4, 3);
System.out.println(t.area);
System.out.println(t.base);
System.out.println(t.height);
	}

}
