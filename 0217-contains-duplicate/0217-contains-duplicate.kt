class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = HashSet<Int>()
        for(i in 0 until nums.size){
            if(set.contains(nums[i])){
                return true
            }
            set.add(nums[i])
        }
        return false
    }
}