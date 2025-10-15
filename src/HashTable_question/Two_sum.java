package HashTable_question;
import java.util.*;

public class Two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int arr[]={22,12,2,0,0,2};
		Scanner sc = new Scanner(System.in);
		
		int target= sc.nextInt();
		int results[]=twoSum(arr,target);
		
		System.out.println("the indices"+results[0]+" "+results[1]);
		
	}

	static int[] twoSum(int[]nums,int target) {
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			int complement =target -nums[i];
			
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}
			map.put(nums[i],i);
		}
	
		throw new IllegalArgumentException("no solution");
	}
}