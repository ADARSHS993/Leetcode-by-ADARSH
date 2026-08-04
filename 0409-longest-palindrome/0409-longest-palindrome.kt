class Solution {
    fun longestPalindrome(s: String): Int {
        
        val map = HashMap<Char,Int>()

        for(i in s){
            map[i] = map.getOrDefault(i,0)+1
        }

        var length = 0
        var isodd = false
        for(i in map.values){
            if(i % 2 == 0){
                length += i
            }else{
                length += i - 1
                isodd = true
            }
        }

        if(isodd){
            length++
        }

        return length
    }
}