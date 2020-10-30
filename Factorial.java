import java.io.*;
import java.util.*;
public class Factorial {
	public static void main(String ags[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		Factorial obj=new Factorial();
		for(int i=0;i<=n;i++)
			System.out.println(i+"!= "+obj.fact(i));
		scan.close();
		
	}
	
	int fact(int n){
		if(n<=1){
			return 1;
		}
		
		return n*fact(n-1);
	}
}

/*
	Enter the number
	11
	0!= 1
	1!= 1
	2!= 2
	3!= 6
	4!= 24
	5!= 120
	6!= 720
	7!= 5040
	8!= 40320
	9!= 362880
	10!= 3628800
	11!= 39916800
*/

