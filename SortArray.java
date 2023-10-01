import java.util.HashSet;
import java.util.LinkedHashSet;

class SortArray {
    // leetcode problem 26. Remove Duplicates from Sorted Array
    public static void main(String[] args) {
        int[] arr = {-3,-1,0,0,0,3,3};
        removeDuplicates(arr);

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        LinkedHashSet <Integer> set = new LinkedHashSet <>(); 
        for (int i = 0; i < nums.length ; i++) {
            set.add(nums[i]); 
        }
        int k = 0;
        for(int i: set){
            nums[k] = i; 
            k++; 
        }

        for ( int i: nums) {
            System.out.print(i + " ");
        }
        System.out.println("|k: " + set.size());
        return set.size(); 
    }  
}