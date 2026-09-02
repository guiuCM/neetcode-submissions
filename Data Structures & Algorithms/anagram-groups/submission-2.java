class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    Map<String, Integer> anagramGroups = new HashMap<>();
    List<List<String>> result = new ArrayList<>();

    for(int i = 0; i < strs.length; i++) {
      String sortedStr = sort(strs[i]);

      if(anagramGroups.containsKey(sortedStr)){
        int index = anagramGroups.get(sortedStr);
        result.get(index).add(strs[i]); //agregar el anagrama al grupo existente
      }
      else{
        List<String> newGroup = new ArrayList<>();
        newGroup.add(strs[i]);
        result.add(newGroup);
        anagramGroups.put(sortedStr, result.size() - 1);
      }
    }

    return result;
  }
  private String sort(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }
}
