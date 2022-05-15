public class maximumSubarray  {
    public int max_subarray(int [] nums){
        int max_sum = nums[0];
        int current_sum = max_sum;
        for(int i=1;i<nums.length;i++){
            current_sum = Math.max(current_sum + nums[i], nums[i]);
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }
}
