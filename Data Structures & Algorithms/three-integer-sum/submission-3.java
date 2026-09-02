public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums == null || nums.length < 3) return new ArrayList<>();

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            //si l'array està ordenat els següents tb seràn >0
            if (nums[i] > 0) break; 

            //Evitar duplicats pel número i (el primer del triplet)
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    //Seguir buscant encara qeu haguem trobat ja una solució

                    //Evitar duplicats
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return res;
    }
}