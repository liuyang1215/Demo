package Day10;

public class ABCImpl implements ABC{
	private double balance;
	private String password;
	
	public ABCImpl(String password,double balance){
		this.balance = balance;
		this.password = password;
	}


	public double getBalance() {
		
		return balance;
	}

	
	public boolean drawMoney(double number) {
		if(balance - number > -2000){
			balance -= number;
			return true;
		}else {
			return false;
		}
	}

	public boolean checkPwd(String input) {
		if(password.equals(input)){
			return true;
		}else {
			return false;
		}
	}

	
	public boolean payTelBill(String phoneNum, double sum) {
		if(phoneNum.length() == 11 && (balance - sum > -2000)){
			return true;
		}else{
			return false;
		}
	}

}
