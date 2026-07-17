class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        
        var left = 0 
        for(right in nums.indices){
            if(nums[right] != `val`){
                nums[left] = nums[right]
                left++
            }
        }

        return left
    }
}