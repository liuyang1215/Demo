package Day04;

public class HomeWork {

	public static void main(String[] args) {
		long a = 9;
		long b = a;
		for(int i=0;i<9;i++){
			a=a*10+9;
			b+=a;
		}
			
		System.out.println(b);

	}

}
