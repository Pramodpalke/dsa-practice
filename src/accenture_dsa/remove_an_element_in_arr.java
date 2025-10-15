package accenture_dsa;
import java.util.*;
public class remove_an_element_in_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int arr[]= {1,2,2,3,4};
		
		List<Integer> al= new ArrayList<>();
		
		
		int rmElement=2;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=rmElement) {
				al.add(arr[i]);
			}
		}
		
		for(Integer k: al) {
			System.out.println(k);
		}
	}

}
