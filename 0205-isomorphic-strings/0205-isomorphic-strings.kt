class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {

        val mapS = HashMap<Char,Char>()
        val mapT = HashMap<Char,Char>()

        for(i in s.indices){
            val c1 = s[i] 
            val c2 = t[i]

            if (mapS.containsKey(c1)) {
                  if (mapS[c1] != c2) {
                    return false
                    }
                 } else {
                mapS[c1] = c2
                }

            if(mapT.containsKey(c2)){
                if(mapT[c2] != c1){
                    return false
                }
                }else{
                    mapT[c2] = c1
                }
        }
        return true
    }
}