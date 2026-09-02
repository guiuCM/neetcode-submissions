from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        s = {}      # diccionari: paraula_ordenada -> index_de_la_llista (dins les llistes)
        sol = []    # llista de llistes amb els anagrames

        for word in strs:
            #ordena la paraula i ajunta la llista per tornar a crear una string
            x = ''.join(sorted(word))

            if x in s:
                sol[s[x]].append(word) #afegeix la paraula a continuació de la última en la seva llista
            else:
                s[x] = len(sol) #afegeix la nova entrada al diccionari amb l'index de la següent llista de llistes
                sol.append([word]) #afegeix una nova llista petita amb la paraula, a continuació

        return sol
