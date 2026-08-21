class Solution {
    fun singleNonDuplicate(nums: IntArray): Int {
        var start = 0
        var end = nums.size - 1

        while(start < end){
            var mid = start + (end - start) / 2

            if(mid % 2 != 0){
                mid--
            }

            if(nums[mid] == nums[mid + 1]){
                start = mid + 2
            }else{
                end = mid
            }
        }

        return nums[end]
    }
}