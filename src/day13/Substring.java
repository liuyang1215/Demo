package day13;
/**
 * String  Substring (int beginIndex, int endIndex)
 * 返回字符串中从下标beginIndex（包括）开始到endIndex（不包括）
 * 结束的子字符串
 * 
 * String  Substring (int beginIndex )
 *  返回字符串中从下标beginIndex（包括）开始到字符串结尾到子字符串
 *  
 *  	String str = "wo men shi zu guo de hua duo";
		String subStr = str.substring(0, 5);
		String subStr1 = str.substring(5);
		System.out.println(subStr);
		System.out.println(subStr1);		
 *		result:
 *      wo me
 *      n shi zu guo de hua duo
 *
 *	char charAt(int index)
 * charAt方法用于返回字符串指定位置的字符。参数index表示指定的位置
 * 
 * @author txgcwm
 *
 */
public class Substring {

	public static void main(String[] args) {
	
		
		String string = "someapp/manager/emplist.action";
		
		int index = string.lastIndexOf("/");
		
		String string2 = string.substring(index+1);
		
		System.out.println(string2);

		

	}

}
