package general;

import java.util.Scanner;
public class EvenNo_Reverse {
	
public static void main(String[] args) {
		
@SuppressWarnings("resource")
Scanner sc =new Scanner(System.in);

int count =1;
int [] a=new int [5];
System.out.println(a.length);
for(int i=0;i<a.length;i++) {
	System.out.println("Enter the "+ count++ +" number: ");
	a[i]=sc.nextInt();
}
for(int j =a.length-1;j>=0;j--) {
//	System.out.println(a[j]+" ");
	if(a[j]%2 ==0) {
		System.out.println(a[j]+" ");
	}
}
	}
}