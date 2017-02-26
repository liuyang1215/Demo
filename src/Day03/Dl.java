package Day03;
// 命令输入
import java.util.Scanner;
public class Dl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请选择功能：1、显示全部纪录 2、查询登录纪录 0、退出");
        int command = scan.nextInt();
        
        switch(command){
        case 1:
        	System.out.println("显示全部纪录");
        	break;
        	
        case 2:
        	System.out.println("查询登录纪录");
        	break;
        	
        case 0:
        	System.out.println("欢迎下次再来！");
        	break;
        	
       default:
    	   System.out.println("Your input is illegal！");
        
	}
}
}	


