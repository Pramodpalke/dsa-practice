package DSA_binary_search;

public class Lower_bound_Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,4,5,8,19};
			int x =19;
		int ans = binary_search(arr,arr.length,x);
		
		System.out.println(ans);
		 
		
		
	}
	
	public static int binary_search(int arr[],int n,int x) {
		int low =0;
		int high=n-1;
		int ans=x;
			
			while(low<=high) {
				int mid =(low+high)/2;
				
					if(arr[mid]>=x) {
						ans= mid;
						high =mid-1;
					}
					else {
						low=mid+1;
					}
			}
			return ans; 
	}

}
