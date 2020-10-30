import java.util.*;
import java.util.Scanner;
import java.io.*;
public class Fibonacci {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the term number");
		int count=scan.nextInt();
		Fibonacci obj=new Fibonacci();
		obj.fibo(count);
		scan.close();
		
	}
	
	void fibo(int n){
		int f1=0,f2=1,f3;
		for(int i=0;i<n-1;i++){
			System.out.print(f1+" + ");
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		System.out.print(f1);
		
	}

}


/*
 	Enter the term number
	8
	0 + 1 + 1 + 2 + 3 + 5 + 8 + 13
*/


