
class ValidParantheses {
    // leetcode problem 20. Valid Parentheses
    public static void main(String[] args) {
        String s = "(){[]}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack stack = new Stack(); 

        for (int i = 0; i < s.length(); i++) {
          Character inStack = stack.peek(); 
          if(inStack == null){
            stack.push(s.charAt(i));  
          } else if(compareChars(inStack, s.charAt(i))){
            stack.pop(); 
          } else {
            stack.push(s.charAt(i));
          }
    
        }
        return stack.isEmpty(); 
    }

    public static boolean compareChars(Character left, Character right) {
        if (left == (int) 123 && right == (int) 125) {
            return true;
        }
        if (left == (int) 40 && right == (int) 41) {
            return true;
        }
        if (left == (int) 91 && right == (int) 93) {
            return true;
        }
        return false;
    }

}