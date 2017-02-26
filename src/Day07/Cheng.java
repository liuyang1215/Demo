package Day07;

public class Cheng {
private int num;
	public static void main(String[] args) {
		Cheng s = new Cheng();
		s.num =13;
		update(s);
		System.out.println(s.num);
	}
	public static void update(Cheng s){
		s.num=9;
	}
}
