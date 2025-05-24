class Solution {
    public int[] getConcatenation(int[] nums) {
       int lenghts = nums.length;
       int[] a = new int[2*lenghts];
       for(int i = 0 ; i < lenghts;i++)
       {
        a[i] = nums[i];
        a[i+lenghts]=nums[i];
       }
       return a;
    }
}