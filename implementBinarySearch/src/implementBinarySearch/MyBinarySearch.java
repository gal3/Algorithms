package implementBinarySearch;

public class MyBinarySearch {

	public static int binarySearch(int[] arr, int val){
		if(arr == null){
			throw new NullPointerException("array is null");
		}
		
		double min = 0;
		double max = arr.length-1; //max index in array
		int mid; //keep track of where the search is occurring
		while(min<=max){
			mid = (int)Math.ceil((min+max)/2);
//			System.out.println(mid);
			if(arr[mid]==val){
				return mid;
			}
			else if(arr[mid]<val){//search higher portion of array
				min = mid+1;
			}
			else{//search lower portion of array
				max = mid-1;
			}
		}
		
		return -1; //not found
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,6,7,9};
		int val = 5;
		int retVal;
		retVal = binarySearch(arr, val);
		System.out.println(retVal);
	}

}
