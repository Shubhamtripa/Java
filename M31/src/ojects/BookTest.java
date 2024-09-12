package ojects;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 =new Book();
		Book b2 =new Book();
		Book b3 =new Book();
b1.title="Harry Potter";
b1.price=1250;
b2.title="Titanic";
b2.price= 900;
b3.title="JAVA";
b3.price=800;

		System.out.println("Book details of B1");
		System.out.println(b1.title);
		System.out.println(b1.price);
		System.out.println("Book details of B2:-");
		System.out.println(b2.title);
		System.out.println(b2.price);
		System.out.println("Book details of B3:-");
		System.out.println(b3.title);
		System.out.println(b3.price);

	}

}
