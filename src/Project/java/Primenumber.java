package Project.java;

public class Primenumber {

	public static void main(String[] args) {
             
		int count=0 ;
		System.out.println("original number ");
		for(int  i=0; i<=10; i++) {
			System.out.print(" "+(i));
		}
		System.out.println("prime number ");
		for(int i=1;i<=10;i++) {
			
			count =0;
		
			for( int j=1; j<=i; j++) {
				//System.out.println("prime number");
				
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+ " ");
		
		}
	}

}
