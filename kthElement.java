import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Arrays;

class kthElement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
       int k = sc.nextInt(); 
        ArrayList <Integer> list = new ArrayList<> (); 
        while(sc.hasNextInt()){
            int num = sc.nextInt(); 
            list.add(num); 
        }
        int [] array = new int[list.size()]; 
        for(int i = 0; i < list.size(); i++) array[i] = list.get(i);
        arrange(array, 0, array.length - 1, k);
     //   System.out.println(cheatFind(array, k)); 

    }    

   /*  public static int cheatFind(int[] nums, int k) {
        Arrays.sort(nums);
        int res = nums[nums.length - k]; 
        return res; 
    }*/

    public static int arrange(int[] nums , int first, int last, int k) {
        int left = first; 
        int right = last; 
        int pivot = nums[nums.length - k]; 
       
        
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
        for(int j: nums)
        System.out.print(j + " ");
        System.out.println("|| left: " + left + " || right: " + right + " || pivot: " + pivot );
    
        return 0; 
    }
}