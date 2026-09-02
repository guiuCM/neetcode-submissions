public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        // 1. Primer pas obligatori: Ordenem l'array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // 2. EVITAR DUPLICATS del primer número:
            // Si aquest número és igual a l'anterior, el saltem perquè generaria els mateixos triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // 3. Apliquem el patró de dos punters per a la resta de l'array
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    
                    // Avancem els punters després de trobar una solució
                    l++;
                    r--;

                    // 4. EVITAR DUPLICATS dels punters esquerre i dret:
                    // Saltem els números idèntics per no repetir triplets
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                    
                } else if (sum < 0) {
                    l++; // La suma és massa petita, necessitem un número més gran
                } else {
                    r--; // La suma és massa gran, necessitem un número més petit
                }
            }
        }
        return res;
    }
}