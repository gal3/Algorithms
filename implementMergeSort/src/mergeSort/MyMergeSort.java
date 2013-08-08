package mergeSort;

import java.util.Arrays;

public class MyMergeSort {

	public static int[] merge(int[] a, int[]b){
		
		int lenResult = a.length+b.length;
		int[] result = new int[lenResult];
		
		int indexa=0;
		int indexb=0;
		int indexResult=0;
		
		while(indexResult<lenResult){
			if(indexa<a.length && indexb<b.length){ //compare elements to merge
				if(a[indexa] < b[indexb]){
					result[indexResult] = a[indexa];
					indexResult++;
					indexa++;
				}
				else{
					result[indexResult] = b[indexb];
					indexResult++;
					indexb++;
				}
			}
			else if(indexa>=a.length){ //append rest of b to array
				while(indexb<b.length){
					result[indexResult] = b[indexb];
					indexResult++;
					indexb++;
				}
			}
			else{ //append rest of a to array
				while(indexa<a.length){
					result[indexResult] = a[indexa];
					indexResult++;
					indexa++;
				}
			}
		}
		
		return result;
	}
	
	public static int[] mergeSort(int[] arr){
		
		if(arr.length<=1){
			return arr;
		}
		
		int mid = arr.length/2;
		
		int[] left = Arrays.copyOfRange(arr, 0, mid);
		int[] right = Arrays.copyOfRange(arr, mid, arr.length);
		
		return merge(mergeSort(left), mergeSort(right));
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,0,6,7,3,3,4,5,9,8,2,0,6,7,3,3,4,5,9,8,2,0,6,7,3,3,4,5,9,8};

		int[] result = mergeSort(a);
		for(int i: result){
			System.out.print(i+" ");
		}

	}

}
