class Solution {

    fun validPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left < right) {
            if (s[left] != s[right]) {
                return isPalindrome(s, left + 1, right) ||
                       isPalindrome(s, left, right - 1)
            }
            left++
            right--
        }

        return true
    }

    fun isPalindrome(s: String, left: Int, right: Int): Boolean {
        var i = left
        var j = right

        while (i < j) {
            if (s[i] != s[j]) {
                return false
            }
            i++
            j--
        }

        return true
    }
}