package Project.java;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("input operator: ");
		
		char ch= sc.next().charAt(0);
		System.out.println("Input two numbers: ");
		int a= sc.nextInt(),b=sc.nextInt();
		
		
		switch(ch){
			case'+':
			System.out.println((a+b));
				break;
				
			case'-':
				System.out.println( (a-b));
				break;
				
			case'*':
				System.out.println( (a*b));
				break;
			case'/':
				System.out.println( (a/b));
				break;
	
			default:
				System.out.println( "not a natch");
		}
//		System.out.println("yes next-");
//		System.out.println("no");
		

	}

}
