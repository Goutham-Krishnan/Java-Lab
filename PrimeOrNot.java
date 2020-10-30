import java.util.*;
import java.io.*;
public class PrimeOrNot {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		int flag=1;
		for(int i=2;i<n/2&&flag==1;i++)
			if(n%i==0)
				flag=0;
		
		if(flag==1)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is not prime");
		scan.close();
	}

}

/*
	Enter the number
	77
	77 is not prime
*/
