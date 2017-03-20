package day16;
/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 * @author Xiloer
 *
 */
public class Test01 {

	public static void main(String[] args) {
		String string = "HelloWorld";
		test1(string);
		test2(string);
		test3(string);
		test4(string);
		test5(string);
		test6(string);
		test7(string);
		test8(string);
		test9(string);

	}
	public static void test1(String string) {
		
		System.out.println("length:"+string.length());
	}
	
	public static void test2(String string) {
		System.out.println(string.indexOf("o"));
		System.out.println(string.lastIndexOf("o"));
	}
	
	public static void test3(String string) {
		System.out.println(string.lastIndexOf("o",5));
	}
	
	public static void test4(String string) {
		System.out.println(string.substring(0,5));
	}
	
	public static void test5(String string) {
		System.out.println(string.substring(5,10));
	}
	
	public static void test6(String string) {
		String string2 = "   hello   ";
		System.out.println(string2.trim());
	}
	
	public static void test7(String string) {
		System.out.println(string.charAt(6));
	}
	
	public static void test8(String string) {
		System.out.println(string.startsWith("h"));
		System.out.println(string.endsWith("ld"));
	}
	
	public static void test9(String string) {
		System.out.println(string.toLowerCase());
		System.out.println(string.toUpperCase());
	}

}
