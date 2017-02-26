package Day06;

import java.util.Scanner;


public class CaiZiMu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int level;
		
		do {
			System.out.print("please input level:5、7、9: ");
			level = scan.nextInt();	
			if(level==5 || level==7 || level==9 ){
				break;
			}
		}while(true);
		
		char[] chs = generate( level);
		System.out.println(chs);
		int count = 0;
		
		while(true){
			 System.out.println("input");
			 String str = scan.next().toUpperCase();
			 if(str.equals("EXIT")){
				 System.out.println("next play");
				 break;
			 }
			 
			 char [] input = str.toCharArray();
			 int[] result = check(chs, input);
			 if( result[0] == chs.length){
				 int score = chs.length*100-count*10;
				 System.out.println("Congratulations to you right"+score);
				 break;
			 }else {
				 count++;
				 System.out.println(result[1]+" "+result[0]);
			 
			 } 
		 }
	}
	
	public static char[] generate(int level){
		char [] chs = new char[level];
		char [] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		boolean [] flags = new boolean[letters.length];
		
		for(int i=0; i<chs.length; i++){
			int index;
			
			do{
				index = (int)(Math.random()*letters.length);
			} while(flags[index]);
			
			chs[i] = letters[index];
			flags[index] = true;
		}
		
		return chs;
	}
	
	public static int [] check(char[] chs, char[] input) {
		int [] result = new int[2];
		
		for(int i=0;i<chs.length;i++){
			for(int j=0;j<input.length;j++){
				if(chs[i]==input[j]){
					result[1]++;
					if(i==j){
						result[0]++;
					}
					break;
				}
			}
		}
		
		return result;
	}

}
