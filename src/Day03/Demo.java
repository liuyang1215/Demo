package Day03;
import java.util.Scanner;


public class Demo {

	void compare(int a, int b) {
		int temp = 0;
		
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println("max:" + b + "min: " + a);
		
		return;
	}
	
	static void compareThree(int a, int b, int c) {
		System.out.println("你输入的整数为: a = " + a + ", b = "+ b + ", c = " + c);
		
		int t = 0;
		
		if (a > b) {
			t = a ; 
			a = b ; 
			b = t ; 
		}
		
		if (a > c) {
			t = a ; 
			a = c ; 
			c = t ; 
		}
		
		if (b > c) {
			t = b ; 
			b = c ; 
			c = t ; 
		}
		
		System.out.println("升序排列后，结果为："+a+" "+b+" "+c);
	}
	
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请依次输入三个整数a,b,c:");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		
//		compareThree(a, b, c);
		
		compareThree(32, 18, 2);
		compareThree(64, 8, 27);
		compareThree(3, 100, 45);
		compareThree(90, 97, 46);
		compareThree(53, 47, 67);
		compareThree(34, 83, 97);
	}

}
