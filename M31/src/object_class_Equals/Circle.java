package object_class_Equals;

public class Circle {
int radius ;
Circle(int r){
	radius = r;
}
public boolean equals(Object o) {//declaration
	Circle c1 =(Circle)o;        //down casting
	return radius == c1.radius;
}
public static void main(String[] args) {
	Circle c1 = new Circle(5);
	Circle c2 = new Circle(15);
	System.out.println(c1.equals(c2));
}
}
