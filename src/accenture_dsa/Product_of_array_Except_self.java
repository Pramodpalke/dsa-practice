package accenture_dsa;
import java.util.*;
public class Product_of_array_Except_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Solution solver = new Solution();
			int num[]= {1,2,3,4};
		
			int result[]=solver.prouductExceptSelf(num);
			System.out.println("output" + Arrays.toString(result));
	}
	


}

class Solution{
	public int[] prouductExceptSelf(int num[]) {
		int n =num.length;
		
		int ans[]=new int[n];
		int prefix=1;
		for(int i =0;i<n;i++) {
			ans[i]=prefix;
			prefix*=num[i];
		}
		
		
		int postfix=1;
		for(int i =n-1;i>=0;i--) {
			ans[i]*=postfix;
			postfix*=num[i];
		}
		return ans;
	}
}
