class FirstMissingPositive {
    // leetcode problem 41. First Missing Positive
    public static void main(String[] args) {
        int[] nums = new int[] {1};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int ans[] = new int[nums.length + 1];
        for(int i = 0; i < ans.length; i++){
            ans[i] = 0; 
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] <= nums.length) {
                ans[nums[i]] = 1;
            }
        }
        for (int i : ans) {
         System.out.print(ans[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < ans.length; i++) {
            if (ans[i] == 0) {
                return i;
            }
        }
        return ans.length;
    }
}