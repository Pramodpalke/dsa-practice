package DSA_binary_search;

public class Search_element_in_rotated_sorted_array {

    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int target = 9;

        int result = search_it(arr, arr.length, target);
        System.out.println("Index of target: " + result);
    }

    public static int search_it(int arr[], int n, int target) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;  // Return the index, not the value

            // Check if left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;  // Target lies in the left half
                } else {
                    low = mid + 1;
                }
            }
            // Otherwise, the right half must be sorted
            else {
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;  // Target lies in the right half
                }
                else {
                    high = mid - 1;
}
            }
        }
        return -1;
    }
}