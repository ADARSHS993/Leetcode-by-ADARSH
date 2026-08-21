class Solution {
    fun findPeakElement(nums: IntArray): Int {
        
        var start = 0
        var end = nums.size - 1

        while(start < end){
            val mid = start + (end - start) / 2

            if(nums[mid] < nums[mid + 1]){
                start = mid + 1
            }else{
                end = mid
            }
        }

        return end
    }
}