package Array_Striver_Dsa;
import java.util.*;
public class NumberofSubArraywithXorK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {4,2,2,6,4};
			int find =6;
			int count=0;
			for(int i =0;i<arr.length;i++) {
				int xor=0;
				for(int j=i;j<arr.length;j++) {
					xor^=arr[j];
					if(xor==find) { 
						count++;
						System.out.println("sakallaka booom... found from the array of:"+arr[i]+"to..."+arr[j]);
						break;
					}
				}
				break;
			}
			
	}

}
