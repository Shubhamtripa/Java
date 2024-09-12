package method_overloading;

public class Calci {
public int add(int i ,int j) {
	return i+j;
}
//compile time error 
//in one class method with same name and same signature is not allowed

/*int add(int i, int j) {
	return i-j;
}*/

public int add(int i,int j, int k) {
	return i+j+k;
}
}
