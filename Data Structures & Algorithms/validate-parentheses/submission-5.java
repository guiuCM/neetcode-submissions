class Solution {
    public boolean isValid(String s) {
        Deque<Character> pila = new ArrayDeque<>();

        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                pila.push(c);
            }
            else{
                if(pila.isEmpty()) return false;
                char top = pila.peek();

                if(c == ')' && top == '('){
                    pila.pop();
                }
                else if(c == '}' && top == '{'){
                    pila.pop();
                }
                else if(c == ']' && top == '['){
                    pila.pop();
                }
                else{
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
}
