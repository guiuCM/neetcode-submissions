class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        
        char[] sol = strs[0].toCharArray();
        int pref = sol.length; 

        for(int i = 1; i < strs.length; ++i){

            int cont = 0;
            int minLen = Math.min(strs[i].length(), pref);
            for(int j = 0; j < minLen; ++j){
                if(strs[i].charAt(j) == sol[j]){
                    cont += 1;
                }
                else{
                    break;
                }
            }
            
            if(cont < pref){
                pref = cont;
            }
        }

        StringBuilder s = new StringBuilder();
        for(int i = 0; i < pref; ++i){
            s.append(sol[i]);
        }

        return s.toString();
    }
}