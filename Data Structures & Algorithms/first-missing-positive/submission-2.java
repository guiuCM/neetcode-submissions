class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0) return 1;

        int[] arr = new int[100001];

        for(int n : nums){
            if(n > 0 && n < 100001) arr[n] = 1;
        }

        boolean found = false;
        int i = 1;
        while(!found){
            if(arr[i] == 0){
                found = true;
            }
            else{
                ++i;
            }
        }

        return i;
    }
}