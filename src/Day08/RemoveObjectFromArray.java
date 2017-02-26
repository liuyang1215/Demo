package Day08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveObjectFromArray {
	private static int getLength(Object object) {
		Class<? extends Object> type = object.getClass();
	    if (type.isArray()) {
	    	Class<?> elementType = type.getComponentType();
	    	System.out.println("Array of: " + elementType);
	    	return Array.getLength(object);
	    }
	    
		return 0;
	}
	
    private static Object remove(Object array, int index) {
        int length = getLength(array);
        if(index >= 0 && index < length) {
            Object result = Array.newInstance(array.getClass().getComponentType(), length - 1);
            System.arraycopy(array, 0, result, 0, index);
            if(index < length - 1) {
                System.arraycopy(array, index + 1, result, index, length - index - 1);
            }
            return result;
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length);
        }
    }

	public static int[] remove(int[] array, int index) {
        return (int[])((int[])remove((Object)array, index));
    }
	
    public static void main(String args[]) {
        int[] test = new int[] { 101, 102, 103, 104, 105};
     
        System.out.println("Original Array : size: " + test.length );
        System.out.println("Contents: " + Arrays.toString(test));

        test = remove(test, 2); //remove an element at index 2

        System.out.println("Size of array after removing an element: " + test.length);
        System.out.println("Content of Array after removing an object: "
                           + Arrays.toString(test));
     
    }
 
}
