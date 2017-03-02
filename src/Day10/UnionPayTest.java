package Day10;

import java.util.Scanner;

public class UnionPayTest {

	public static void main(String[] args) {
		UnionPay icbc = new ICBCImpl("123456",2000);
		Scanner scan = new Scanner(System.in);
		System.out.println("please input password:");
		String input = scan.next();
		if(icbc.checkPwd(input)) {
			System.out.println("please input money");
			 double money = scan.nextDouble();
			 if(icbc.drawMoney(money)) {
				 System.out.println("success drawMoney "+icbc.getBalance());
			 } else {
				 System.out.println("qu qian shi bai");
			 }
		} else {
			System.out.println("mi ma cuo wu");
		}
	}

}
 interface UnionPay{
	public double getBalance();
	public boolean drawMoney(double number);
	public boolean checkPwd(String input);
}
 interface ICBC extends UnionPay{
	public void payOnline(double number);
}
 interface ABC extends UnionPay{
	public boolean payTelBill(String phoneNum, double sum);
}