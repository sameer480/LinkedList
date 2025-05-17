class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }if(nums[i]==0){
                c=0;
            }
            max1=Math.max(max1,c);
        }
        return max1;
        
    }
}