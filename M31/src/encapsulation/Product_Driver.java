package encapsulation;

public class Product_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product p1 = new Product();
p1.setPrice(120.20);
System.out.println(p1.getPrice());
p1.setPrice(370);//updated price
System.out.println(p1.getPrice());
	}

}
