import java.util.HashSet;

class HashSetProb {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 1, 3, 2, 5 };
       singleNumber(nums);
    }

    public static int[] singleNumber(int[] nums) {
        HashSet <Integer> foo = new HashSet<>();

        for (int i : nums) {
            if (foo.add(i) == false) {
                foo.remove(i);
            }

        }
        int [] res =  new int [foo.size()];
        int j = 0; 
       for(Integer i : foo){
            res[j++] = i; 
        }

        for (int i : res) {
         System.out.print(i + " ");
        }
        return res;
    }
}