package Day02;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int fn = f(n);
		double a = (double)f(n)/f(n+1);
		System.out.println(a);
		System.out.println(fn);
	
		

	}
	public static int f(int n){
		if(n == 1 || n==2){
			return 1;
		}else{
			return f(n-1)+f(n-2);
		}
		
	}



}
