class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var totalsum = 0 
        for(i in 0..nums.size - 1 ){
           totalsum += nums[i]
        }
        var leftsum = 0
        for(i in 0 until nums.size){
            val rightsum = totalsum - leftsum - nums[i]

            if(leftsum == rightsum){
                return i
            }
            leftsum += nums[i]
        }

        return -1
    }
}