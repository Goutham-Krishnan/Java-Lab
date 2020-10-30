import java.io.*;
import java.util.Scanner;

public class AddNumbers {
	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		System.out.println(n1+n2);
		scan.close();
	}
}

/*
	Enter the numbers
	32
	45
	77
*/
