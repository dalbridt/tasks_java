class quicksort {
    public static void quickSort(int[] nums , int first, int last) {
        if(first >=last){
            return; 
        }
        int left = first; 
        int right = last; 
        int pivot = nums[(left + right) / 2]; 
        while(left <= right ){
            while(nums[left] < pivot){
                left++; 
            }
            while (nums[right]> pivot){
                right--;
            }
            if(left <= right){
                int temp = nums[left]; 
                nums[left] = nums[right]; 
                nums[right] = temp; 
                left++;
                right--; 
            }
        }
        quickSort(nums, first, right);
        quickSort(nums, left, last);
    }
}