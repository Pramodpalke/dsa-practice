package accenture_dsa;
import java.util.*;

public class removeDuplicateElementInAnArray {
    public static void main(String[] args) {
        
        // Using HashSet to remove duplicates
        Set<Integer> st = new HashSet<>();
        
        int arr[] = {1, 1, 2, 2, 3, 3};

        // Add all elements to the set
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }

        // Print unique elements
        for (int i : st) {
            System.out.print(i);
        }
    }
}
