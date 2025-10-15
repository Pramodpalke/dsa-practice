package One_month_DSA_prep;

public class Max_sum_of_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,3,4,1,5};
		int k =3;
		int maxsum=Integer.MIN_VALUE;
		
		for(int i =0;i<=nums.length-k;i++) {
			int currentsum=0;
			for(int j =i;j<i+k;j++) {
				currentsum+=nums[j];
			}
			maxsum=Math.max(maxsum, currentsum);
		}
		System.out.println("max element int he array is :"+ maxsum);
			
	}

}
