import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums1 = new int[]{4,7,9,7,6,7};
        int[] nums2  = new int[]{5,0,0,6,1,6,2,2,4};

        System.out.println(Arrays.toString(sol.intersection(nums1,nums2)));

    }
}
