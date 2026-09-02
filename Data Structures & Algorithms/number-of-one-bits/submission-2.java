class Solution {
    //Truco que aprender, coste lineal para la cantidad de 1'
    public int hammingWeight(int n) {
        int cont = 0;
        while (n != 0) {
            n = n & (n - 1); // Borra de un plumazo el último '1'
            cont++;          // Contamos que hemos borrado un '1'
        }
        return cont;
    }
}
