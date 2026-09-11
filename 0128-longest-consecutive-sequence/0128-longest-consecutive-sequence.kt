class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toSet()

        var longest = 0
        for(num in nums){

            if(!set.contains(num - 1)){

                var current = num
                var count = 1

                while(set.contains(current + 1)){
                    current++
                    count++
                }

                 longest = maxOf(longest,count)
            }
        }
        return longest
    }
}