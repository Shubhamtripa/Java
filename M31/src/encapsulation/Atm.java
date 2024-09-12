package encapsulation;

public class Atm {
	
private int atm_id;
private String location;
private double money;
private int initial_balance,withdrawl_amt,deposite_amt,total_balance;

void setAtm_id(int id) {
	atm_id=id;
}
void setAtm_loc(String loc) {
	location=loc;
}
void setAtm_money(double money) {
	this.money=money;
}
int getAtm_id() {
	return atm_id;
}
String getAtm_loc(){
	return location;
}
double getAtm_money() {
	return money;
}
void setwithdrawl(int initial_bal,int withdrawl_amt){
initial_balance=initial_bal;
this.withdrawl_amt=withdrawl_amt;
}
int getwithdrawl() {
	
if (initial_balance >= withdrawl_amt) {
	initial_balance=initial_balance - withdrawl_amt;
	System.out.print("Account Balance is ");
}
else
{
	System.out.println("Insufficent Balance.");
}
System.out.print("Amount: ");
return initial_balance;
}

void setdeposite(int deposite_amt){
this.deposite_amt=deposite_amt;
}
int getdeposit() {
	System.out.print("Total Balance: ");
	int total_bal=initial_balance+deposite_amt;
	total_balance=total_bal;
	return total_balance;
}

int getcheck_balance() {
	System.out.print("Availale Balance:");
	return total_balance;
}
}
