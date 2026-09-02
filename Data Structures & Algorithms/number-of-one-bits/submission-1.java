class Solution {
    public int hammingWeight(int n) {
        int cont = 0;

        // Mientras n no sea 0 (usamos != 0 porque n puede ser negativo)
        while (n != 0) {
            // Comprobamos si el último bit es un 1
            if ((n & 1) == 1) {
                cont += 1;
            }
            // Desplazamos todos los bits un espacio hacia la derecha
            // OJO: Usamos >>> (unsigned) en lugar de >> para evitar
            // bucles infinitos con números negativos en Java.
            n = n >> 1;
        }
        return cont;
    }
}
