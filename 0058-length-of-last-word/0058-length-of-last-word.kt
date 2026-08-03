class Solution {
    fun lengthOfLastWord(s: String): Int {
        var count = 0
        var i = s.length - 1

        while(i >= 0 && s[i] == ' '){
            i--
        }

        while(i >= 0 && s[i] != ' '){
            count++
            i--
        }

        return count

    }
}