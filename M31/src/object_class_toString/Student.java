package object_class_toString;

public class Student {
int id,age;
String name;
Student(int id,String name,int age){
	this.id=id;
	this.age=age;
	this.name=name;
}
public String toString() {
	return "Student_ID:"+id+" Student_Name: "+name+" Student_Age: "+age;
}
public static void main(String[] args) {
	Student s = new Student(101, "Shubham", 25);
	System.out.println(s);
}
}
