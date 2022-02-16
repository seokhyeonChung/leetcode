class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
	int i=0, n= nums.length, ans[]= new int[n];
	for(int num:nums)
		if(num<pivot) ans[i++]= num;
	for(int num:nums)
		if(num==pivot) ans[i++]= num;
	for(int num:nums)
		if(num>pivot) ans[i++]= num;
	return ans;
}
}