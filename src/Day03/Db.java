package Day03;
//求三个数中的最大值
import java.util.Scanner;
public class Db {
	static int maxNum(int a, int b) {
		return a > b ? a : b;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please input three numbers:a,b,c");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int max = ((a > b?a:b) >c)? (a > b?a:b ) :c;
        System.out.println(max);
        
        max = maxNum(a, maxNum(b, c));
        System.out.println("use function to cal max: " + max);
	}

}
