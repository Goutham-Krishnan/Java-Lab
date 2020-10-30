import java.io.*;
import java.util.*;
public class Armstrong {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		Armstrong obj=new Armstrong();
		if(n==obj.check(n)){
			System.out.println(n+" is armstrong");
		}
		else{
			System.out.println(n+" is not armstrong");
		}
		scan.close();
	}
	
	int check(int n){
		int sum=0;
		while(n>0){
			sum+=java.lang.Math.pow((n%10),3);
			n=n/10;
		}
		return sum;
	}
}

/*
	Enter the number	
	159
	159 is not armstrong
*/

/*
 	Enter the number
	370
	370 is armstrong
*/
	
