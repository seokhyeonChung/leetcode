class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int N = nums.length;
        if (N == 1) {
            return nums;
        }
        
        int[] res = new int[N];
        int l = -1, r = N;
        //collect all elements smaller than pivot
        for (int i = 0; i < N; i++) {
            if (nums[i] < pivot) {
                res[++l] = nums[i];
            }
            if (nums[N - 1 - i] > pivot) {
                res[--r] = nums[N - 1 - i];
            }
        }
        //fill the pivot elements if any
        for (int i = l + 1; i <= r - 1; i++) {
            res[i] = pivot;
        }
        return res;
    }
}