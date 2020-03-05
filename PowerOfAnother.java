package looping;

import java.util.Scanner;

public class PowerOfAnother {

	public static void main(String[] args) {
		
		System.out.println("enter two numbers");
		int power,base;
		
		int result=1 ;
		Scanner sc=new Scanner(System.in);
		
		power=sc.nextInt();
		base=sc.nextInt();
		
		for (int i=1;i<=power;i++) {
			
			result *=base;
		}
		
System.out.println(result);
	}

}
