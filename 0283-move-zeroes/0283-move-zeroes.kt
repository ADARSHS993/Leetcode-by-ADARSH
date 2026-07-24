class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var left = 0
        var right = 0
        while(right < nums.size){
            if(nums[right] != 0){
                val temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
                right++
                left++
            }else{
                right++
            }
        }
    }
}