package Day03;
//超市收银台
import java.util.Scanner;
public class Dy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please input unitPrice:");
		double unitPrice = scan.nextDouble();
		
		System.out.println("please input amount:");
		double amount = scan.nextDouble();
		
		System.out.println("please input money");
		double money = scan.nextDouble();
		
		double totalPrice = unitPrice * amount;
		
		if (totalPrice >= 500){
			totalPrice *= 0.8 ;
		}
		if (money >= totalPrice){
			double change = money - totalPrice ;
			System.out.println("amountMoney:"+ totalPrice +",change:"+ change);
			
		}else{
			 double balance = totalPrice - money ;
			System.out.println("ERROR，You don't have enough money，you still owe "+balance+" yuan");
		}
	}

}
