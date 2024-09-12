package object_class_toString;

public class Circle {
int radius;
Circle(int radius){
	this.radius=radius;
}
public String toString() {
	return "Radius : "+radius;
}
public static void main(String[] args) {
	Circle c = new Circle(5);
	System.out.println(c);
}
}
