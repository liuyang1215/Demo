package day13;

import day12.calculate;

/**
 * 生成所有汉字
 * @author txgcwm
 *
 */
public class Chinese {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		for(char a = '\u4e00', i = 1;a <= '\u9fa5';a++,i++) {
			str.append(a);
			if(i % 50 == 0) {
				str.append("\n");
			}
		}
		System.out.println(str.toString());
	}

}
