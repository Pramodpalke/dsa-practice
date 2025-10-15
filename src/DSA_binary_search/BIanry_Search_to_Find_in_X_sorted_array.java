package DSA_binary_search;

public class BIanry_Search_to_Find_in_X_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// binary search is always works if the array is in the sorted array
			
		int arr[]= {3,4,6,7,9,12,16,18};
		
		int n = arr.length;
		
		int target= 6;
		
		System.out.println(binary_search(arr,n,6));
		
		
	}
	
	static  int binary_search(int arr[],int length,int target) {
		
		int low =0;
		int high=length-1;
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			 if(arr[mid]==target) return arr[mid];
			 
			 else if (target >arr[mid]) low = mid+1;
			 
			 else high=mid-1;
		}
		return -1;
		
	}

}
