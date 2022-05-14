import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class intersectionOfTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        
        Map<Integer, Integer> hm = new HashMap<>();
        
        // find the smaller of the two arrays
       
        for (int i = 0; i < nums1.length; i++) {
            if (hm.containsKey(nums1[i])) {
                hm.replace(nums1[i], hm.get(nums1[i]) + 1);
            } else {
                hm.put(nums1[i], 1);
            }
        }
        ArrayList<Integer> arraylist = new ArrayList<>();
        for (int j = 0; j < nums2.length; j++) {
            if (hm.containsKey(nums2[j])) {
                if ((hm.get(nums2[j]) > 0)) {
                    hm.replace(nums2[j], hm.get(nums2[j] - 1));
                    arraylist.add(nums2[j]);
                }
            }
        }
        int[] arr = new int[arraylist.size()];
        for (int i = 0; i < arraylist.size(); i++) {
            arr[i] = arraylist.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 4, 9, 5 };
        int[] arr2 = new int[] { 9, 4, 9, 8, 4 };
        intersect(arr1, arr2);
    }
}

// [4,9,5] && nums2 =[9,4,9,8,4] => [4,9]