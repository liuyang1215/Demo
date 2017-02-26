package Day05;
import java.util.Scanner;
public class ZhiS {

	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入查找质数的范围2～");
		int m = scan.nextInt();
		int count = 0 ;
		
		for(int i=2;i<m;i++){
			boolean zhishu = true;
			
			for(int j=2;j<i;j++){
				if(i%j==0){
					zhishu = false;
					break;
				}		
			}
			
			if(zhishu){
				System.out.print(i+" ");
				count++;
				if(count%10==0){
					System.out.println();
					
				}
			}
		}
		System.out.println("共有"+count +"个质数");
	}
				
}
