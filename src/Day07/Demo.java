package Day07;

import java.util.Scanner;



public class Demo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please input your age:");
		int age = scan.nextInt();
		System.out.println("please input your name:");
		String name = scan.next();

		System.out.println("name: " + name + "age: " + age);
		
		/*class Student {
			String name;
			int age;
			float score;
			
			void say() {
				System.out.println(name+"的年龄是"+age+", 成绩是"+score);
			}
		}
		
	    Student stu1 = new Student();  // 必须使用new关键字
	    // 操作类的成员
	    stu1.name = "小明";
	    stu1.age = 15;
	    stu1.score = 92.5f;
	    stu1.say();
	    
	    int a = 10;
	    int b = 0b01101;
	    int c = 0101;
	    int d = 0x2f;
	    
	    System.out.println("a = " + a + "\n" + "b = " + b + "\n" + "c = " + c + "\n" + "d = " + d);
	*/
		
		scan.close();
	}
}

