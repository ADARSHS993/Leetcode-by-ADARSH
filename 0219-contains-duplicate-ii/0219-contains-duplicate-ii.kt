class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        
        val set = HashSet<Int>()

        for(num in nums.indices){

            if(set.contains(nums[num])){
                return true
            }

            set.add(nums[num])

            if(set.size > k){
                set.remove(nums[num - k])
            }
        }

        return false
    }
}