package non_Static;

public class Box {
	double length,breadth;
Box(double length,double breadth){//constructor
	this.length=length;
	this.breadth=breadth;
}
double area() {
	return length*breadth;
}
}
