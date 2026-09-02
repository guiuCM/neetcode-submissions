public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            if (res.containsKey(key)) {
                res.get(key).add(s);
            } else {
                List<String> nouGrup = new ArrayList<>();
                nouGrup.add(s);
                res.put(key, nouGrup);
            }
        }
        return new ArrayList<>(res.values());
    }
}