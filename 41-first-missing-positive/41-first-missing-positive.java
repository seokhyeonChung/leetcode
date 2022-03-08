class Solution {
    public int firstMissingPositive(int[] nums) {
        int size = nums.length;
        boolean[] numbers = new boolean[size+1];
        
        for(int n : nums){
            if(n>size || n<0) continue;
            numbers[n] = true;
        }
        
        for(int i =1; i<size+1; i++){
            if(!numbers[i]) return i;
        }
        return size+1;
    }
}