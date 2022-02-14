class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        int i =0, j = 0, k = 0;
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                arr[k++] = nums1[i];
                i++;
            } else{
                arr[k++] = nums2[j];
                j++;
            }
        }
        if(i == m){
            for(; k<arr.length; k++){
                arr[k] = nums2[j++];
            }
        } else{
            for(; k<arr.length; k++){
                arr[k] = nums1[i++];
            }
        }
        
        if(arr.length%2 == 0) return (double) (arr[arr.length/2 -1] + arr[arr.length/2])/2;
        else return (double) arr[arr.length/2];
    }
}