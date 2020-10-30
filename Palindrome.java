import java.io.*;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		int n1=0,n2=n;
		while(n>0){
			n1=n1*10+n%10;
			n=n/10;
		}
		if(n1==n2)
			System.out.println(n2+" is palindrome");
		else
			System.out.println(n2+" is not a palindrome");
		
		scan.close();
		
	}

}

/*
	Enter the number
	34543
	34543 is palindrome
*/
