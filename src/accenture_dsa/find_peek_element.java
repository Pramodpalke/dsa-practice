package accenture_dsa;

public class find_peek_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,3,2};
		int left =0;
		int right = arr.length-1;
		
		
		while(left<=right) {
			int mid = (left+right)/2;
			
				if(mid>0 && arr[mid]<arr[mid-1]) {
					right = mid -1;
				}
				else if (mid<arr.length-1 && arr[mid]<arr[mid+1]) {
					left = mid+1;
				}
				else {
					System.out.print("the peek element"+ arr[mid]);
					break;
				}
				
		}
	}

}
