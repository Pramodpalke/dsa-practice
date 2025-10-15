package Array_Striver_Dsa;
import java.util.*;
import java.util.Collections;
public class Three_Sum_Goggle_question_better_solution_Using_Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,0,1,2,-1,-4};
		System.out.println(" here is the triplet that gives u sum of zero :"+three_sum(arr));
	}
	
	
	public static List<List<Integer>> three_sum(int []nums){
		Set<List<Integer>> result =new HashSet<>();
		for(int i=0;i<nums.length-2;i++) {
			Set<Integer> seen =new HashSet<>();
			for(int j =i+1;j<nums.length;j++) {
				int complement =-(nums[i]+nums[j]);
				if(seen.contains(complement)) {
					List<Integer> triplet= Arrays.asList(nums[i],nums[j],complement);
						Collections.sort(triplet);
						result.add(triplet);
					
				}
				seen.add(nums[j]);
				
			}
		}
		return new ArrayList<>(result);
	}
}
