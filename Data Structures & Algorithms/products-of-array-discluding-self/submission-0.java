class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = 1;
        for(int i=1;i<n;i++){
            left[i] = left[i-1] * nums[i-1];
        }
        right[n-1] = left[n-1];
        int rightProd = 1;
        for(int i=n-2;i>=0;i--){
            rightProd = rightProd * nums[i+1];
            right[i] = rightProd * left[i];
        }
        return right;
    }
}  
