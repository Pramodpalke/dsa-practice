package accenture_dsa;

public class opt_remove_duplicates_in_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,2,3,3};
		
		int i =0;
		for(int j =0;j<arr.length;j++) {
			if(arr[j]!=arr[i]) {
				arr[i+1]=arr[j];
				i++;
			}
		}
		
		System.out.println("after changes this is the array");
		for(int k =0;k<=i;k++) {
			System.out.println(arr[k]);
		}
	}

	
}
