package Day10;

public class UnionPayTest {

	public static void main(String[] args) {
		
	}

}
public interface UnionPayTest{
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