class Solution {
   public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map <Character,Character> transform = new HashMap<>();
        transform.put(')', '(');
        transform.put(']', '[');
        transform.put('}', '{');


        for(char c : s.toCharArray()){
            if(transform.containsKey(c)){
                if (!stack.isEmpty() && stack.peek() == transform.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }

        return stack.isEmpty();

   }
}
