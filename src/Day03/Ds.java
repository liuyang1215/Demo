package Day03;
// 年龄判断
import java.util.Scanner;
public class Ds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please input your age:");
		int age = scan.nextInt();
        if (age >= 18 && age <= 50){
        	System.out.println(age);
        }else{
        	System.out.println("ni shi wu min");
        }
	}

}
