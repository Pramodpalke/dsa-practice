package Array_Striver_Dsa;

public class Three_Sum_Goggle_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,0,1,2,-1,-4};
		for(int i =0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						System.out.println("founf the sum : "+arr[i]+" "+arr[j]+" "+" "+arr[k]);
						break;
					}
				}
			}
		}
		
	}

}
