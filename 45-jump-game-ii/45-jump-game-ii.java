class Solution {
    public int jump(int[] nums) {
        int max = 0;
        int nMax = 0;
        int result = 0;
        for(int i =0; i<nums.length-1; i++){
            nMax = Math.max(nMax, i + nums[i]);
            if(i == max) {
                result++;
                max = nMax;
            }
        }
        return result;
    }
}