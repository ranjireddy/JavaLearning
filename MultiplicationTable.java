package looping;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int i;
		int n;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the n value ");
		n=sc.nextInt();
		int sum;
		
		for (i=1;i<=10;i++) {
			
			
			
			System.out.println(n+"*"+i+"="+ n*i);
			
			
		}
	}

}
