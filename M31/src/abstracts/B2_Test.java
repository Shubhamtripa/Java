package abstracts;

public class B2_Test implements B1 {

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public int sub(int m, int n) {
		// TODO Auto-generated method stub
		return (m-n);
	}
	
public static void main(String[] args) {
	B2_Test b = new B2_Test();
	b.add(10, 20);
	System.out.println(b.sub(2, 1));
}
}
