package Day03;
import java.util.Random;

public class DoubleBall {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] dballArray = new int[7];
		for (int i = 0; i < dballArray.length - 1;) {
			dballArray[i] = rand.nextInt(33) + 1; 
			System.out.println(i + ": " + dballArray[i]);
			i++;
		}
		
		dballArray[6] = rand.nextInt(16) + 1;
		
		int[] cball = new int[7];
		cball[0] = 13 ;
		cball[1] = 26 ;
		cball[2] = 30 ;
		cball[3] = 31 ;
		cball[4] = 19 ;
		cball[5] = 8 ;
		cball[6] = dballArray[6] ;
		
		boolean blue = false;
		
		if (cball[6] == dballArray[6]){
			blue = true;
		}
			
		int count = 0;
		
		for(int i = 0; i < dballArray.length - 1; i++){
			if (cball[i] == dballArray[i]){
				count++;
			}
		}
		
		switch (count){
		case 6:
			if (blue){
				System.out.println("1");
			}else{
				System.out.println("2");
			}
			break;
			
		case 5:
			if (blue){
				System.out.println("3");
			}else{
				System.out.println("no");
			}
			break;
			
		case 4:
			if (blue){
				System.out.println("4");
			}else{
				System.out.println("no");
			}
			break;
			
		case 3:
			if (blue){
				System.out.println("5");
			}else{
				System.out.println("no");
			}
			break;
			
		default:
			if (blue){
				System.out.println("6");
			}else{
				System.out.println("no");
			}
			break;
			
		}
	}

}
