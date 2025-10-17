package accenture_dsa;
import java.util.*;
public class First_And_last_position_of_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,5,6};
		Scanner Sc = new Scanner(System.in);
				
		int target= Sc.nextInt();
		int first= firstposition(arr,target);
		int last =lastposition(arr,target);
		
		System.out.println("the positions are :" + first +" "+ last);
	}
	
	public static int firstposition(int arr[],int target) {
		
		
		if (arr==null || arr.length==0 ) return -1 ;
		
		int index =-1;
		int left =0;
		int right = arr.length-1;
		
		while(left<=right) {
			
			int mid = (left+right)/2;
			
			if (arr[mid]>=target) {
				right= mid-1;
				
			}
			else {
				left=mid+1;
			
			}
			if(arr[mid]==target) index =mid;
				
		}
		return index;
	}
	public static int lastposition(int arr[],int target) {
		int index =-1;
		int left =0;
		int right = arr.length-1;
		
		while(left<=right) {
			int mid = (left+right)/2;
			 
			if (arr[mid]<=target) {
				left = mid+1;
			}
			else {
				right= mid-1;
				
			}
			if (arr[mid]== target) {
				index = mid;
			}
		}
		return index;

	}
	
	
	

}
