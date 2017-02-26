package Day04;
//季节判断
import java.util.Scanner;
public class ShiWu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("please input month:");
		int month = scan.nextInt();
		
		if(month <=0 || month >12){
			System.out.println("Your input is illegal！");
			
		}else if (month >= 3 && month <=5){
			System.out.println(month +" is spring");
		
		}else if (month >= 6 && month <= 9){
			System.out.println(month +" is summer");
		
		}else if (month >=10 && month <=11){
			System.out.println(month +" is autumn");
		
		}else{
			System.out.println(month +" is winner");
		}
	}

}
