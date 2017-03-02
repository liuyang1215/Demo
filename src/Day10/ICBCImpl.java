package Day10;

public class ICBCImpl implements ICBC{
	private double money;
	private String pwd;
	
	public ICBCImpl(String pwd,double money){
		this.money = money;
		this.pwd = pwd;
	}

	public double getBalance() {

		return money;
	}

	
	public boolean drawMoney(double number) {
		if(number < money) {
			money -= number;
			return true;
		}else{
			return false;
		}
	}

	public boolean checkPwd(String input) {
		if(pwd.equals(input)){
			return true;
		}else{
			return false;
		}
	}


	public void payOnline(double number) {
		if(number < money){
			number -= money;
		}
	}

}
