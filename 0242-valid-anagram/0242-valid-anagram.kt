class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if(s.length != t.length){
            return false
        }

        val key1 = s.toCharArray().sorted().joinToString("")
        val key2 = t.toCharArray().sorted().joinToString("")

        return key1 == key2

    }
}