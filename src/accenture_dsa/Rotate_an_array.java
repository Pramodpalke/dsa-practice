package accenture_dsa;
import java.util.Scanner;

public class Rotate_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,4,5,6,7};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value for the k:");
		int k =sc.nextInt();
		
		rotate(nums,k);
		
		for(int num:nums) {
			System.out.print(num+"");
		}
		
	}
	
	public static void rotate(int nums[],int k ) {
		
		
		reverse(nums,0,nums.length-1);
		
		reverse(nums,0,k-1);
		reverse(nums,k,nums.length-1);
		
	}
	
	
	 private static void reverse(int[] nums, int start, int end) {
		         while (start < end) {
		            int temp = nums[start];
		             nums[start] = nums[end];
		             nums[end] = temp;
		          start++;
		             end--;
	
}
}
}