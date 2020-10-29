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
