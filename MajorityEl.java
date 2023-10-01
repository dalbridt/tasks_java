import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MajorityEl{
    // leetcode problem 229. Majority Element II
    public static void main(String[] args) {
        int [] nums = {1}; 
        majorityElement(nums);

    }

      public static List<Integer> majorityElement(int[] nums) {
        HashMap <Integer, Integer> foo = new HashMap <>(); 
        for(int i = 0; i < nums.length; i++){
             if(foo.containsKey(nums[i]) == true){
                int value = foo.get(nums[i]); 
                value ++; 
                foo.put(nums[i], value); 
            }

            if(foo.containsKey(nums[i]) == false){
                foo.put(nums[i], 1); 
            } 
        }
        for (Map.Entry <Integer, Integer> pair: foo.entrySet())  {
            System.out.println(pair);
        }
        int freq = nums.length / 3; 
        List <Integer> res = new ArrayList<>(); 
        for (Map.Entry <Integer, Integer> pair: foo.entrySet()) {
            if(pair.getValue() > freq){
                res.add(pair.getKey()); 
            }
        }
        for (Integer integer : res) {
            System.out.print(integer + " ");
        }

        return res; 
    }
}