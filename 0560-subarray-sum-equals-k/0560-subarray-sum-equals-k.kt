class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        
        val map = HashMap<Int,Int>()

        map[0] = 1
        var sum = 0
        var count = 0

        for(num in nums){
            sum += num

            val need = sum - k

            count += map.getOrDefault(need,0)

            map[sum] = map.getOrDefault(sum,0) + 1
        }

        return count
    }
}