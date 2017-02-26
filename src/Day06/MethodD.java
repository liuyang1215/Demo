package Day06;

import java.util.Random;



public class MethodD {

	public static void main(String[] args) {
		int [] arr = generateArray(6, 100);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int [] generateArray(int length, int max) {
		int [] arr = new int [length];
		Random rand = new Random();
		for(int i=0;i<arr.length;i++){
			arr [i] = rand.nextInt(max);
		}
		
		return arr;
	}

}
