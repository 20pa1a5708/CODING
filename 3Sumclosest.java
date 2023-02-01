class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closetsum=nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        int tempsum=0;
        for(int i=0;i<nums.length-2;i++){
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                int currentsum=nums[i]+nums[start]+nums[end];
                if(Math.abs(target-currentsum)<Math.abs(target-closetsum)){
                    closetsum=currentsum;
            }
            if(currentsum==target)
            return target;
            if(currentsum>target){
                end--;
            }
            else{
                start++;
            }
            }
        }
        return closetsum;
    }
}
