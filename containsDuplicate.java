import java.util.HashSet;

class containDuplicate{
    boolean contain_duplicate(int [] nums){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        return hs.size() != nums.length;
    }
}