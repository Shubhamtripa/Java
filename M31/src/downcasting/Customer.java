package downcasting;

public class Customer extends Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cname="Shubham";
int c_accountno= 12346654;
double c_balance=2000.54;

Bank b1 = new Customer();//up casting
b1.bid=1001;
b1.blocation="Prayagraj";
b1.bname="HDFC";

Customer c1 = (Customer)b1;// Down casting
System.out.println(c1.bid);
System.out.println(c1.bname);
System.out.println(c1.blocation);
System.out.println(cname);
System.out.println(c_accountno);
System.out.println(c_balance);
	}

}
