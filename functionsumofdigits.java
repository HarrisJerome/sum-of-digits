package day6;

import java.util.Scanner;

public class functionsumofdigits {
public int sum(int a) {
		
		int res=0;
		while(a>0) {
			
			int	t=a%10;
				res=res+t;	
				a=a/10;
				
	}
		return res;
}
public static void main(String args[] ) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=s.nextInt();
	functionsumofdigits x =new functionsumofdigits();
	int y=x.sum(n);
	System.out.println(y);	
}
}
	
