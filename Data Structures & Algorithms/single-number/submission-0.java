class Solution {
    public int singleNumber(int[] nums) {
        
        Set <Integer> seen = new HashSet<>();

        for(int n : nums){
            if(seen.contains(n)){
                seen.remove(n);
            }
            else{
                seen.add(n);
            }  
        }

        return seen.iterator().next();

    }
}
