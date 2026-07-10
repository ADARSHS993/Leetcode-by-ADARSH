class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left < right) {

            // Skip non-alphanumeric characters
            while (left < right && !s[left].isLetterOrDigit()) {
                left++
            }

            while (left < right && !s[right].isLetterOrDigit()) {
                right--
            }

            // Compare ignoring case
            if (s[left].lowercaseChar() != s[right].lowercaseChar()) {
                return false
            }

            left++
            right--
        }

        return true
    }
}