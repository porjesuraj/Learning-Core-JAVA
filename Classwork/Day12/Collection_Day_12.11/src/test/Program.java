package test;
public class Program {
	public static int linearSearch( int[] arr, int key ) {
		for( int index = 0; index <= arr.length; ++ index ) {
			if( arr[ index ] == key )
				return index;
		}
		return -1;
	}
	public static int binSearch( int[] arr, int key ) {
		int left = 0;
		int right = arr.length - 1;
		while( left <= right ) {
			int mid = ( left + right ) / 2;
			if( key == arr[ mid ] )
				return mid;
			else if( key > arr[ mid ] )
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		
	}
}
