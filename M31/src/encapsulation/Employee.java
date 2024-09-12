package encapsulation;

public class Employee {
private int id;
private String name;
private double salary;
void setID(int emp_id){
	this.id=emp_id;
}
void setName(String emp_name) {
	this.name=emp_name;
}
void setSalary(double emp_salary) {
	this.salary=emp_salary;
}
int getID() {
	return this.id;
}
String getName() {
	return this.name;
}
double getSalary() {
	return this.salary;
}
}
