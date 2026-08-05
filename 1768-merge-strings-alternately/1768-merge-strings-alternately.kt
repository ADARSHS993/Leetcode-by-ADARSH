class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val ans = StringBuilder()
        var i = 0
        var j = 0
        while(i < word1.length && j < word2.length){
            ans.append(word1[i])
            ans.append(word2[j])
            i++
            j++
        }

        while(i < word1.length){
            ans.append(word1[i])
            i++
        }

        while(j < word2.length){
            ans.append(word2[j])
            j++
        }

        return ans.toString()
    }
}