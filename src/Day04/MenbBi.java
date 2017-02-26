package Day04;
// 7的倍数
import java.util.Scanner;
public class MenbBi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		int sum = scan.nextInt();

		boolean flag = (sum % 7 ==0);
		String str = flag?(sum +" is 7 multiples"):(sum +" is not 7 multiples");
		System.out.print(str);
	}

}
