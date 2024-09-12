package ojects;

public class Cons_OverLoad {
	int sid;
	int age;
	String name;
Cons_OverLoad(){
	
}
Cons_OverLoad(int sid, int age){
	this.sid=sid;
	this.age=age;
}
Cons_OverLoad(int sid,String name, int age){
	this.sid=sid;
	this.name=name;
	this.age=age;
}
}
