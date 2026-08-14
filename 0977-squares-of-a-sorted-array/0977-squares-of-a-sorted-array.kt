class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        for(i in nums.indices){
            nums[i] = nums[i] * nums[i]
        }
        var ans = nums.sortedArray()
        return ans
    }
}