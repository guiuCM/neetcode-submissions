
class Solution {
    public int evalRPN(String[] tokens) {
        // Usamos una pila para guardar los números esperando a ser operados
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            // Si es un operador, sacamos los dos últimos números
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } 
            else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } 
            else if (token.equals("-")) {
                // OJO AL ORDEN: El primero que sale es el de la derecha (n2)
                int n2 = stack.pop();
                int n1 = stack.pop();
                stack.push(n1 - n2);
            } 
            else if (token.equals("/")) {
                // OJO AL ORDEN: El primero que sale es el divisor (n2)
                int n2 = stack.pop();
                int n1 = stack.pop();
                stack.push(n1 / n2);
            } 
            else {
                // Si no es ningún operador, es un número. Lo convertimos y a la pila.
                stack.push(Integer.parseInt(token));
            }
        }

        // El resultado final será el único número que quede en la pila
        return stack.pop();
    }
}