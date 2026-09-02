class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if(people == null || people.length == 0) return 0;

        //Ordenar -> nlogn, es pot fer amb O(n)?
        Arrays.sort(people);

        // 2. Invertim l'array in-place (Two Pointers)
        int left = 0, right = people.length - 1;
        while (left < right) {
            int temp = people[left];
            people[left] = people[right];
            people[right] = temp;
            left++;
            right--;
        }


        if(people[0] > limit) return 0; // impossible
        else if(people.length == 1) return 1;

        int l = 0;
        int r = people.length-1;
        int cont = 0;

        while (l <= r){
            if(people[l] + people[r] <= limit){
                cont++;
                l++;
                r--;
            }
            else{
                cont++;
                l++;
            }
        }

        return cont;
    }
}