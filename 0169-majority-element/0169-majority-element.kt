class Solution {
    fun majorityElement(nums: IntArray): Int {
        
        if(nums.isEmpty()) return 0

        val map = HashMap<Int,Int>()

        for(num in nums){

            map[num] = map.getOrDefault(num,0)+1

            if(map[num]!! > nums.size/2){
                return num
            }
        }
        return -1
    }
}