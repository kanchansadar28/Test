package Project.java;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
	
	int days =7;
		
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your choice");
		 days =sc.nextInt();
		
		
		switch(days){
			case 1:
				System.out.println("SUNDAY");
				break;
				
			case 2:
			System.out.println("MONDAY");
			break;
			
			case 3:
				System.out.println("TUESDAY");
				break;
			
				
			case 4:
				System.out.println("WENSDAY");
				break;
			case 5:
				System.out.println("THURSDAY");
				break;
				
			case 6:
				System.out.println("FRIDAY");
				break;
		
			case 7:
				System.out.println("saturday");
				break;
		
	
				
				default:
					System.out.println("not match");
					break;
		}
		
		
	}

}
