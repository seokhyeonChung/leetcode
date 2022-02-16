class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        for(int i =0; i<nums.length; i++){
            if(nums[i] < pivot){
                list1.add(nums[i]);
            } else if(nums[i] > pivot){
                list2.add(nums[i]);
            } else{
                list2.addFirst(nums[i]);
            }
        }
        int[] result = new int[nums.length];
        int idx = 0;
        while(!list1.isEmpty()){
            result[idx++] = list1.poll();
        }
        while(!list2.isEmpty()){
            result[idx++] = list2.poll();
        }
        return result;
    }
}