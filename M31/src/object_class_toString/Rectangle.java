package object_class_toString;

public class Rectangle {
 int length ,breadth;
 Rectangle(int l,int b){
length=l;
breadth=b;
 }
 public String toString() {
	 return "Length:"+length+ "  Breadth:"+breadth+"  Area="+(length*breadth); 
 }
	 
 public static void main(String[] args) {
	Rectangle r = new Rectangle(10, 20);
	System.out.println(r);
}
}
