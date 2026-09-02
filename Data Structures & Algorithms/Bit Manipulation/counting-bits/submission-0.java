class Solution {
    public int[] countBits(int n) {
        int [] res = new int[n+1];
        int cont = 0;

        while(cont != n + 1){
            res[cont] = numberOfbits(cont);
            cont += 1;
        }
        return res;
    }

    private int numberOfbits (int n){

        int cont = 0;
        while (n != 0){
            n = n & (n-1);
            cont += 1;
        }

        return cont;
    }
}
