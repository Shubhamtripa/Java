package Array;
//import java.util.*;

import java.util.Scanner;

//pull back

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int []a=new int[5];
for (int i=0;i<5;i++) {
	System.out.println("enter element at index: "+i);
	a[i]=sc.nextInt();
}
for(int j=0;j<a.length;j++) {
	System.out.print(a[j]+" ");
}
	}

}
