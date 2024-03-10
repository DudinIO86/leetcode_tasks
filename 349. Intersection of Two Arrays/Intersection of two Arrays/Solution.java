import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution{
    public int[] intersection(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int cout = 0;
        int index = 0;

        int[] arr = new int[size1 + size2];

        if (size1 >= size2) {
            for (int i = 0; i < size2; i++) {
                for (int j = 0; j < size1; j++) {
                    if (nums1[j] == nums2[i]) {
                        arr[index] = nums2[i];
                        index++;
                    }
                }
            }
        } else {
            for (int i = 0; i < size1; i++) {
                for (int j = 0; j < size2; j++) {
                    if (nums2[j] == nums1[i]) {
                        arr[index] = nums1[i];
                        index++;
                    }
                }
            }
        }


        Set set = new HashSet();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }


        Iterator<Integer> itr = set.iterator();

        int f = set.size();

        int[] arr2 = new int[f];

        boolean flag=false,flag1 = false,flag2 = false;

        for (int i = 0; i < size1; i++) {
            if (nums1[i] == 0) {
                flag1 = true;
            }

        }
        for (int i = 0; i < size2; i++) {
            if (nums2[i] == 0) {
                flag2 = true;
            }

        }
        if(flag1==true&&flag2==true){
            flag=true;
        }

        for (int i = 0; i < f; i++) {
            int item = itr.next();
            arr2[i] = item;
        }
        index = 0;

        int[] arr3 = new int[0];

        if (flag == false) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] == 0) {
                    cout++;
                }
            }
            arr3 = new int[f -cout];
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] != 0) {
                    arr3[index] = arr2[i];
                    index++;
                }
            }
        }
        else{
            arr3 = new int[f];
            for (int i = 0; i < arr2.length; i++) {
                arr3[i] = arr2[i];
            }

        }

        return arr3;
    }
}