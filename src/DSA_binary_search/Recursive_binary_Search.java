package DSA_binary_search;

public class Recursive_binary_Search {

    public static void main(String[] args) {
        // Recursive Binary Search
        
        int arr[] = {3, 4, 6, 7, 9, 12, 16, 18};
        int target = 9;

        System.out.println(search(arr, target)); 
    }

    public static int search(int[] nums, int target) {
        return binary_search(nums, 0, nums.length - 1, target);
    }

    public static int binary_search(int arr[], int low, int high, int target) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;  // Prevents overflow

        if (arr[mid] == target) return arr[mid];

        else if (target > arr[mid]) {
            return binary_search(arr, mid + 1, high, target);
        }
        
        return binary_search(arr, low, mid - 1, target);
    }
}
