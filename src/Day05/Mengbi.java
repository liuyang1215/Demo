package Day05;

import java.util.Scanner;
import java.util.StringTokenizer;
public class Mengbi {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("请输入当前日期（年－月－日）：");
//		int  year =scan.nextInt();
//		int  months =scan.nextInt();
//		int  day = scan.nextInt();
		
		String goodsVolume = scan.nextLine();
		
		scan.close();
		
		int gv[];
		int j = 0; 
		StringTokenizer tokenizer = new StringTokenizer(goodsVolume, "-");
		gv = new int[tokenizer.countTokens()];//动态的决定数组的长度
		while (tokenizer.hasMoreTokens()) {
	        String d = tokenizer.nextToken();
	        gv[j] = Integer.valueOf(d);//将字符串转换为整型
	        j++;
		}
		     
		int year = gv[0], months = gv[1], day = gv[2];
		
		int [] month = new int[]{31,0,31,30,31,30,31,31,30,31,30,31};
		boolean flag = (year%4==0 && year%100!=0 || year%400==0);
		if(flag){
			month[1]=29;
		}else{
			month[1]=28;
		}
	
		int sum = 0;
		
		for(int i = 0; i < months - 1; i++) {
			sum += month[i];
		}
		
		sum += day;
		System.out.println("今天是"+year+"的第"+sum+"天");
	}
}


