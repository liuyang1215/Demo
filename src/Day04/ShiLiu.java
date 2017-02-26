package Day04;
import java.util.Scanner;
public class ShiLiu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("please input month:");
		int month = scan.nextInt();
		
		switch(month){
		case 3:
		case 4:
		case 5:
			System.out.println(month +" is spring");
			break;
			
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println(month +" is summer");
			break;
			
		case 10:
		case 11:
			System.out.println(month +" is autumn");
			break;
			
		case 12:
		case 1:
		case 2:
			System.out.println(month +" is winner");
			break;
			
		default:
			System.out.println("Your input is illegal！");
			break;
		}
	}

}
