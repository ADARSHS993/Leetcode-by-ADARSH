class Solution {
    fun thirdMax(nums: IntArray): Int {
        val set = nums.toHashSet()
        val list = set.sortedDescending()
        return if(list.size >= 3){
            return list[2]
        }else{
            return list[0]
        }
    }
}