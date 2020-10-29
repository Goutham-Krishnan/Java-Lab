import java.io.*;
import java.util.*;
public class OddEven {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		if(n%2==0)
			System.out.println(n+" is even");
		else
			System.out.println(n+" is odd");
	}

}
