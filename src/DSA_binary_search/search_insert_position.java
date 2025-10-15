package DSA_binary_search;
import java.util.*;
public class search_insert_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {1,3,5,6};
			Scanner sc = new Scanner(System.in);
			int target= sc.nextInt();
			System.out.println(binary_search(arr,target));
	}

	public static int binary_search(int arr[],int target) {
		
		int low =0,
			high =arr.length-1;
		
		while(low<=high) {
			int mid =(low+high)/2;
			
			if(arr[mid]==target) return mid;
			
			else if(arr[mid]<target) low= mid+1;
			
			else {
				high=mid-1;
			}
			
		}
		
		return low;
				
		
		
	}
	
}
