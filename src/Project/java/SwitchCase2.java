package Project.java;

import java.util.Scanner;

public class SwitchCase2{
	
	public static void main(String[] args) {
	int a=10000;
	
	Scanner sc=new  Scanner (System.in);

	
	System.out.println("enter your choice");
	a=sc.nextInt();
	
	System.out.println("enter your acc check");
	switch(a) {
	case 1:
		System.out.println(" check your withdraw "+(-a));
		break;
		
	case 2:
		System.out.println(" check your deposit "+(+a));
		break;
		
		default:
		System.out.println("not match");
	}
	

	
	}

	}


