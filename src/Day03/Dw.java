package Day03;
//成绩等级
import java.util.Scanner;
public class Dw {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please input your score:");
		int score = scan.nextInt();
		
		if (score < 0 || score > 100){
			System.out.println("Your input is illegal！");
		}else if (score >= 90){
			System.out.println("A");
		}else if (score >= 80){
			System.out.println("B");
		}else if (score >= 70){
			System.out.println("C");
		}else{
			System.out.println("D");
		}
	}

}
