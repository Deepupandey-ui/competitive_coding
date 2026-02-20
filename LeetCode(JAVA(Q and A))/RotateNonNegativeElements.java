import java.util.ArrayList;

public class RotateNonNegativeElements {

    public int[] rotateElements(int[] nums, int k) {

        int n = nums.length;

        // Step 1: store indices of non-negative elements
        ArrayList<Integer> idx = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                idx.add(i);
            }
        }

        int m = idx.size();
        if (m == 0) return nums;

        // Step 2: normalize k for only these elements
        k = k % m;

        // Step 3: copy their values
        int[] temp = new int[m];
        for (int i = 0; i < m; i++) {
            temp[i] = nums[idx.get(i)];
        }

        // Step 4: LEFT rotate and put back
        for (int i = 0; i < m; i++) {
            nums[idx.get(i)] = temp[(i + k) % m];
        }

        return nums;
    }
}
