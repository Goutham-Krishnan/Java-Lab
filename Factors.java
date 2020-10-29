package jdk;
import java.io.*;
import java.util.*;
public class Factors {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		Factors obj=new Factors();
		obj.computeFactors(n);
		
		scan.close();
		
		
	}
	
	void computeFactors(int n){
		System.out.println("Factors of "+n+" are:");
		for(int i=1;i<n;i++){
			if(n%i==0){
				System.out.println(i);
			}
		}
	}

}
