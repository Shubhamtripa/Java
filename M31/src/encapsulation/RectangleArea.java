package encapsulation;

public class RectangleArea {
	private int length;
	private int breadth;
void setLength_breadth(int length, int breadth) {
	this.length=length;
	this.breadth=breadth;
}
int getArea() {
	return length*breadth;
}
}