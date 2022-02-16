class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int idx = 0;
        int[] result = new int[nums.length];
        for(int num : nums){
            if(num < pivot) result[idx++] = num;
        }
        for(int num : nums){
            if(num == pivot) result[idx++] = num;
        }
        for(int num : nums){
            if(num > pivot) result[idx++] = num;
        }
        return result;
    }
}