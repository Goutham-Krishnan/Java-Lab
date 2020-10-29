import java.util.*;
import java.io.*;
public class SumOfn {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
			sum+=i;
		System.out.println("Sum of numbers upto "+n+" is "+sum);
		scan.close();
	}

}
