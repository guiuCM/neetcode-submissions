class Solution {
        
    List <List<Integer>>result = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> partialResult = new ArrayList<>();
        this.nums = nums;

        backtracking(partialResult, target, 0, 0);
        return result;
    }

    public void backtracking(List<Integer> partialResult, int target, int currentValue, int idx) {
        //base case
        if(currentValue == target){
            result.add(new ArrayList<>(partialResult)); //important fer el new per no guardar una cosa ja guardada a memòria
            return;
        }

        for (int i = idx; i < nums.length; ++i){
            if(currentValue + nums[i] > target) continue;

            partialResult.add( nums[i]);
            backtracking(partialResult, target,  nums[i]+currentValue, i); //no idx+1 !!!
            //partialResult.remove(num); malament! borraria l'índex num, no el valor
            partialResult.remove(partialResult.size() - 1); //important
        }
    }

}
