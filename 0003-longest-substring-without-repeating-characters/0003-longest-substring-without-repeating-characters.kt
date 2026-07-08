class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = HashSet<Char>()
        var left = 0
        var MaxLength = 0
        for(right in s.indices){
            while(set.contains(s[right])){
                set.remove(s[left])
                left++
            }
            set.add(s[right])
            MaxLength = maxOf(MaxLength , right - left + 1)
        }
        return MaxLength
    }
}