package DSA_binary_search;

public class Finding_sqrt_of_number_using_binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {14,18,25,37,48};
		 int n =25;
		 
		int result= binary_search(arr,n);
		System.out.println(result);
		 
	}
	public static int binary_search(int arr[],int n) {
		int ans = 0;
        int low = 0;
        int high = n;  
        while (low <= high) {
            int mid =(high + low) / 2; // Corrected mid calculation
            
            int val = mid * mid; // Square of mid
            
            if (val == n) {
                return mid; // If mid * mid == n, return mid as the exact square root
            } else if (val < n) {
                ans = mid;       
                low = mid + 1; // Move to higher numbers
            } else {
                high = mid - 1; // Move to lower numbers
            }
        }
        return ans; 
	}

}
