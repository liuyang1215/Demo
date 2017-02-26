package Day03;
// 判断闰年平年
import java.util.Scanner;
public class De {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please input year:");
		int year = scan.nextInt();
		
		boolean flag = (year %4 == 0 || year % 100 !=0) && year % 400 == 0 ;
		String  str = flag?(year + "是闰年。") : (year + "是平年。");
        System.out.println(str);
	}

}
