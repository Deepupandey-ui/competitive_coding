package BinarySearch;

public class SearchRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {

            int mid = (i + j) / 2;

            // Step 1: Found
            if (nums[mid] == target) {
                return true;
            }

            // Step 2: Handle duplicates
            if (nums[mid] == nums[j]) {
                j--;
                continue;
            }

            // Step 3: Check sorted half
            if (nums[i] <= nums[mid]) {
                // Left half sorted
                if (nums[i] <= target && target < nums[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else {
                // Right half sorted
                if (nums[mid] < target && target <= nums[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }

        return false;
    }
}
