package day16;

import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 *
 */
public class Test02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input person message:");
		String personInfos = scanner.nextLine();
		String[] string = personInfos.split(";");
		Person[] persons = new Person[string.length];
		for(int i=0;i<persons.length;i++) {
			String string2 = string[i];
			String[] info = string2.split(",");
			String name = info[0];
			int age = Integer.parseInt(info[1]);
			String gender = info[2];
			int salary = Integer.parseInt(info[3]);
			Person person = new Person(name, age, gender, salary);
			persons[i] = person;		
		}
		for(int i=0;i<persons.length;i++) {
			System.out.println(persons[i]);
		}
		

	}

}
