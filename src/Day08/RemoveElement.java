package Day08;

public class RemoveElement {

	public static int[] remove(int[] arr, int index) {
		int[] newArray = new int[arr.length - 1];
		
		if(index == 0) {
			System.arraycopy(arr, 1, newArray, 0, arr.length - 1);
		}else if(index == arr.length - 1) {
			System.arraycopy(arr, 0, newArray, 0, arr.length - 1);
		}else {
			System.arraycopy(arr, 0, newArray, 0, index);
			System.arraycopy(arr, index + 1, newArray, index, newArray.length - index);
		}
		
		return newArray;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
		
//		arr = remove(arr, 0);
//		arr = remove(arr, arr.length - 1);
		arr = remove(arr, 3);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		

	}

}
