class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {

        val map = HashMap<Char,Int>()

        for(ch in magazine){
            map[ch] = map.getOrDefault(ch,0)+1
        }

        for(ch in ransomNote){

            if(!map.containsKey(ch) || map[ch] == 0){
                return false
            }

            map[ch] = map[ch]!! - 1
        }

        return true
    }
}