from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        s = {}      # diccionario: clave -> índice en sol
        sol = []    # lista de listas que contendrá los grupos de anagramas

        for word in strs:
            # Ordenamos la palabra y la convertimos en string para usar como clave
            x = ''.join(sorted(word))

            if x in s:
                # Añadimos la palabra a la sublista existente
                sol[s[x]].append(word)
            else:
                # Creamos una nueva sublista y la añadimos a sol
                s[x] = len(sol)
                sol.append([word])

        return sol
