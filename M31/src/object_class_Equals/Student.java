package object_class_Equals;

public class Student {
int id,age;
String name;
Student(int id,String name,int age){
	this.id=id;
	this.name=name;
	this.age=age;
}
public boolean equals(Object o) {
	Student s1 =(Student)o;//downcasting
	return this.id==s1.id && this.name.equals(s1.name) && this.age==s1.age;
}
public static void main(String[] args) {
	Student s1 =new Student(101, "Shubham", 20);
	System.out.println(s1.equals(s1));
}
}
