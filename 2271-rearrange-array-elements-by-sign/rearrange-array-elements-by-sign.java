class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n = nums.length;
       int[] a = new int[n/2];
       int[] b = new int[n/2];
       int id = 0, idx =0;
       for(int i=0;i<n;i++){
        if(nums[i]>0) a[id++] = nums[i];
        else b[idx++] = nums[i]; 
       } 
    id = 0; idx = 0;
    for(int i=0;i<n;i++){
        if(i%2==0) nums[i] = a[id++];
        else nums[i] = b[idx++];
    }
    return nums;  
    }
}