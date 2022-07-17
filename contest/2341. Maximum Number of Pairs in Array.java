class Solution {
    public int[] numberOfPairs(int[] nums) {
        int count=0;
        int ans[]=new int[2];
        if(nums.length==1){
            ans[0]=0;
            ans[1]=1;
            return ans;
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else{
               mp.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            int val =(int)entry.getValue();
            if(val>=2)
            count+= val/2;
        }
        ans[0]=count;
        ans[1]=nums.length-count*2;
        return ans;
    }
}
