package day13;
//判断是否为回文

public class String_Reverse {

	public static void main(String[] args) {
		String string = "able was i ere i saw elba";
		StringBuilder stringBuilder = new StringBuilder(string);
		String string2 = stringBuilder.reverse().toString();
		if(string.equals(string2)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
