package coding.Arrays;

public class ArrayRotation {
	
	// r is the length by which array needs to be rotated
	// Divide the array into 2 arrays I - array1 -( length -r ) and II -(r)
	// Step 1- Reverse  both the arrays individually and then reverse the entire array
	 static int[] rotateAnArray (int[] a, int r) {
		
		if( a == null ) return null;
		
		if( r == a.length) return a;
		
		int n = a.length-1; 
		int len_1 = n-r;

		reverseArray (a, 0, len_1);
		reverseArray (a, len_1 + 1 , n);
		reverseArray (a, 0, n);
		
		return a;
	}
	
	static void reverseArray(int[] a, int start, int end) {
		
		while(start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;  
			start++;
			end--;	
		}
	}
}
