package Day08;

public class AddElement {
	public static int[] addElement(int[] arr, int index, int element) {
		int[] newArray = new int[arr.length + 1];
		if(index == 0){
			System.arraycopy(arr, 0, newArray, 1, newArray.length - 1);
			newArray[0] = element;
		}else if(index == arr.length - 1){
			System.arraycopy(arr, 0, newArray, 0, newArray.length - 1);
			newArray[arr.length] = element;
		}else {
			System.arraycopy(arr, 0, newArray, 0, index);
			System.arraycopy(arr, index , newArray, index +1, arr.length - index);
			newArray[index] = element;
		}
		
		return newArray;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
		
//		arr = addElement(arr, 0, 7);
//		arr = addElement(arr, arr.length - 1, 8);
		arr = addElement(arr, 2, 9);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
}
