package Day04;
// 秒数转换
import java.util.Scanner;
public class Dw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("please input seconds：");
		int second = scan.nextInt();

		int hour = second/3600;
		int minute = second%3600/60;
		int seconds = second -hour*3600 - minute*60;
		if(second<0){
			System.out.println("Your input is illegal！");
		}else{
			System.out.println(hour+" hour " + minute +" minutes " + seconds +" seconds");
		}
		
	}

}
