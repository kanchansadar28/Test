
package Project.java;

import java.util.Scanner;

public class ReapitString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string data");
		String str =sc.nextLine();
		String str1 []= str.split(" ");
		int count;
		
		count=1;
		for( int i=0; i<=str1.length; i++) {
			count =1;
			for(int  j=i+1; j<str1.length ; j++) {
				if(str1[i].equals(str1[j]))
				{
					count =count+1;
					str1[j]="0";
				}
			}
			if(str1[i]!="0") {
				System.out.println(str1[i]+"    "+count);
			}
		}

	}

}
