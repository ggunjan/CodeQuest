package coding.Arrays;

public class TwoDArraySearch {
	
	
	
	// No Overlapping Numbers
		static boolean twoDArraySearch(int[][] a,  int start, int end, int num) {
			
			if(start > end) return false;

			int col = a[0].length;
		
			int mid = start + (end - start)/2;
			int midVal = a[mid][0];

			if (midVal == num) return true;
			
			if( midVal < num && num <=  a[mid][col-1] ) {
			   	// do search in the row 
				 if( binarySearch(a[mid], 0, col-1, num))
					 return true;
			}
			if (midVal < num ) {
				// move down the row by doing binary search on 
				return twoDArraySearch(a, mid+1, end, num );
			}
			
			if( midVal > num) {
				// move up the row
				return twoDArraySearch(a, start, mid-1, num );
			}

			return false;
		}
		
		
		void twoDArraySearchOverlappingNumber() {
			
		}
		
		static boolean binarySearch(int a[], int start, int end, int num) {
			//Base Case
			if(start > end) return false;
			
			// Recursive Case for Search 
			int mid = start + (end-start)/2;
			int mid_val = a[mid];

			if(mid_val == num ) 
				return true;
			else if(mid_val > num) 
				return  binarySearch(a, start, mid-1, num);
			else 
				return  binarySearch(a, mid+1, end, num);
		}
		

}
