class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    if (strs == null || strs.length == 0) return new ArrayList<>();

    Map<String, List<String>> map = new HashMap<>(); //en vez de guardar indice donde insertar, guardar ya la lista de anagramas

    for (String s : strs) {
      char[] ca = s.toCharArray();
      Arrays.sort(ca);
      String key = String.valueOf(ca);

      // Si la llave no existe, crea una nueva ArrayList
      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }
      // Añade la palabra original a la lista correspondiente
      map.get(key).add(s);
    }

    // Retornamos solo los valores del mapa como una lista de listas
    return new ArrayList<>(map.values());
    }
}
