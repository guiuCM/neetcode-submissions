class Solution:

    def encode(self, strs: List[str]) -> str:

        res = "" #string buit

        for s in strs:
            res = res + str(len(s)) + "#" + s

        return res

        #return "".join(strs)

    
    def decode(self, s: str) -> List[str]:

        res = []
        i = 0

        while i < len(s):
           
            j = i
            while s[j] != '#': #ara no falla amb +10 caracters
                j += 1
            length = int(s[i:j])

            i = j + 1 #inici
            j = i + length #final

            res.append(s[i:j])
            i = j


        return res
            