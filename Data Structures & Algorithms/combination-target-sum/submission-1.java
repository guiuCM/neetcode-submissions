class Solution {
    int[] nums;
    int target;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        List<List<Integer>> result = new ArrayList<>();
        
        backtracking(new ArrayList<>(), result, 0, 0);
        return result;
    }

    private void backtracking(List<Integer> current, List<List<Integer>> result, int idx, int sum) {
        // CASO BASE 1: Nos pasamos del objetivo (Poda)
        if (sum > target) {
            return;
        }
        
        // CASO BASE 2: ¡Encontramos una combinación válida!
        if (sum == target) {
            // CUIDADO: Hacemos una copia profunda (new ArrayList)
            result.add(new ArrayList<>(current));
            return;
        }

        // EXPLORACIÓN:
        for (int i = idx; i < nums.length; i++) {
            // 1. Elegir (Take)
            current.add(nums[i]);
            
            // 2. Explorar (Explore)
            // Le pasamos 'i' como nuevo índice porque podemos REUTILIZAR el mismo número
            backtracking(current, result, i, sum + nums[i]);
            
            // 3. Deshacer (Backtrack)
            // Siempre borramos el ÚLTIMO elemento insertado
            current.remove(current.size() - 1);
        }
    }
}