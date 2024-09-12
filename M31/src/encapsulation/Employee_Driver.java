package encapsulation;

public class Employee_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1 =new Employee();
e1.setID(10);
e1.setName("Shubham");
e1.setSalary(15000);
System.out.println(e1.getID()+e1.getName()+e1.getSalary());
	}

}
