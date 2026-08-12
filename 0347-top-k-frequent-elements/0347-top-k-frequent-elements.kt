class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        
        val map = HashMap<Int,Int>()

        for(num in nums){
            map[num] = map.getOrDefault(num,0)+1
        }

        val list = map.keys.toMutableList()

        list.sortByDescending{
            map[it]
        }

        return list.take(k).toIntArray()
    }
}