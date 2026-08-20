class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if(nums.isEmpty()){
            return -1
        }

        var s = 0
        var e = nums.size - 1

        while(s <= e){
            val mid = s + (e - s) / 2
            if(nums[mid] == target){
                return mid
            }

            if(nums[mid] < target){
                s = mid + 1
            }else{
                e = mid - 1
            }
        }

        return s
    }
}