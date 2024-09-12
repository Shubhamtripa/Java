package encapsulation;

public class Atm_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Atm a1 =new Atm();
a1.setAtm_id(1012012540);
a1.setAtm_loc("civil lines");
a1.setAtm_money(500);
System.out.println("ATM ID: "+a1.getAtm_id());
System.out.println("Location: "+a1.getAtm_loc());
System.out.println("Money in ATM: "+a1.getAtm_money());

a1.setwithdrawl(10000, 1120);
System.out.println(a1.getwithdrawl());

a1.setdeposite(800);
System.out.println(a1.getdeposit());
System.out.print(a1.getcheck_balance());
}

}
