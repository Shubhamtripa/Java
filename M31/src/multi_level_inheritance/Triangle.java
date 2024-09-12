package multi_level_inheritance;

public class Triangle extends Shape {
double base,height;
Triangle(double b,double h){
	this.base=b;
	this.height=h;
}
void display() {
	System.out.println("Height: "+height);
	System.out.println("Base: "+base);
}
}
