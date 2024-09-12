package ojects;

public class EmpDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1 = new Employee();
Employee e2 = new Employee();

e1.id = 1;
e1.name="Tejaswi";
e1.salary=30000;
e2.id=2;
e2.name="Shubham";
e2.salary=1000;
System.out.println("Details of Employee e1:-");
System.out.println("Employee ID: "+e1.id+" Employee Name: "+e1.name+" Salay: "+e1.salary);
System.out.println("Details of Employee e2:-");
System.out.println("Employee ID: "+e2.id+" Employee Name: "+e2.name+" Salay: "+e2.salary);
	}

}
