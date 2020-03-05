package looping;

import java.util.Scanner;

public class SumOfFirstNNatural {

	public static void main(String[] args) {
	
		int i;
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of n");
		
		n = sc.nextInt();
		int sum=0;
		
		for (i=1;i<=n;i++) {
			
			sum =sum+i;
			

			
		}
		
		System.out.println(sum);

	}

}
