class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans =new int[2];
        ans[0]=findFirstIndex(nums,target);
        ans[1]=findSecondIndex(nums,target);
        return ans;
    }
    public int findFirstIndex(int nums[],int target){
       int index=-1;
        
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int midpoint=start + (end-start)/2;
            if(target<=nums[midpoint]){
                end = midpoint-1;
            }
            else{
                start = midpoint+1;
            }
            if(nums[midpoint]==target)index=midpoint;
        }
        
        return index;
    }
     public int findSecondIndex(int nums[],int target){
       int index=-1;
        
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int midpoint=start + (end-start)/2;
            if(target<nums[midpoint]){
                end = midpoint-1;
            }
            else{
                start = midpoint+1;
            }
            if(nums[midpoint]==target)index=midpoint;
        }
        
        return index;
    }
}
