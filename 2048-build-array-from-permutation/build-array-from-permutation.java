class Solution {
    public int[] buildArray(int[] nums) {
       int n = nums.length;
       int[] a = new int[n];
       for(int i = 0; i < n; i++)
       {
        a[i] = nums[nums[i]];
       } 
       return a;
    }
}