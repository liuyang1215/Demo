package Day02;

public class Home {

	public static void main(String[] args) {
		int n = 44;
		int[] str = new int[n];
		str[0] = 1;
		str[1] = 1;
		
		System.out.print(str[0] +" " +str[1]+" ");
		
		for(int i = 2;i<n;i++){
			str [i]=str[i-1]+str[i-2];
			System.out.print(str[i] +" ");
			if(i%10 ==0){
				System.out.println();
			}
		}

	}

}
