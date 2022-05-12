import java.util.HashMap;
import java.util.Map;

class twoSum {
    static int[] two_sum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] + nums[j] == target) && (i != j)) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {

        int[] arr2 = new int[] { 3, 2, 4 };
        two_sum(arr2, 6);

    }
}