package day17;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 *
 */
public class Test01 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input personCounts:");
		int count = Integer.parseInt(scanner.nextLine());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Collection<Emp> emps = new ArrayList<Emp>();
		for(int i = 1;i <= count;) {
			System.out.println("please input the "+i+" message:");
			String line = scanner.nextLine();
			String[] infos = line.split(",");
			String name = infos[0];
			int age = Integer.parseInt(infos[1]);
			String gender = infos[2];
			int salary = Integer.parseInt(infos[3]);
			Date hiredate = sdf.parse(infos[4]);
			Emp emp = new Emp(name, age, gender, salary, hiredate);
			if(emps.contains(emp)) {
				System.out.println("aleary exits");
				continue;
			} else {
				emps.add(emp);
				i++;
			}
			
				System.out.println(emps);

		}
		

	}

}
