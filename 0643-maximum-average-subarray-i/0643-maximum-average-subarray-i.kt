class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var WindowSum = 0.0
        for(i in 0 until k){
            WindowSum += nums[i]
        }

        var maxSum = WindowSum
        for(i in k until nums.size){
            WindowSum += nums[i]
            WindowSum -= nums[i-k]
            maxSum = maxOf(maxSum,WindowSum)
        }
        return maxSum/k
    }
}