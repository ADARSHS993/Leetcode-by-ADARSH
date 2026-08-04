class Solution {
    fun firstUniqChar(s: String): Int {
        
        val freq = IntArray(26)

        for(i in s){
            freq[i - 'a']++
        }

        for(i in s.indices){
            if(freq[s[i] - 'a'] == 1){
                return i
            }
        }
        return -1
    }
}