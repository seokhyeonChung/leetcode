class Solution {
    public int trap(int[] height) {
        int h = height.length;
        if(h == 0) return 0;
        int answer = 0;
        int top = height[0];
        int idx = 0;
        for(int i =0; i<h; i++){
            if(top < height[i]){
                idx = i;
                top = height[i];
            }
        }
        
        int left = height[0];
        for(int i =0; i<idx; i++){
            if(height[i] > left) {
                left = height[i];
            } else if(height[i] < left) answer += left - height[i];
        }
        
        int right = right = height[h-1];
        for(int i = h-1; i>idx; i--){
            if(height[i] > right) {
                right = height[i];
            } else if(height[i] < right) answer += right - height[i];
        }
        return answer;
    }
}