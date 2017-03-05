package Day11;
//随机生成7个数
public class Play {
	public static void main(String[] args) {
		int[] arr = new int[7];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*35+1);
			for(int j=0;j<i;j++) {
				if(arr[i] == arr[j]) {
					i = i - 1;
					break;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
				
	}

}
