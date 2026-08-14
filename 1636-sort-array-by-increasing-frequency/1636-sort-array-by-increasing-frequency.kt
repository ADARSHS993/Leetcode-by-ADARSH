class Solution {
    fun frequencySort(nums: IntArray): IntArray {

        val map = HashMap<Int,Int>()
        for(num in nums){
            map[num] = map.getOrDefault(num,0)+1
        }

        val list = nums.toMutableList()

        list.sortWith(
            compareBy<Int>{ map[it]!! }
            .thenByDescending{ it }
        )

        return list.toIntArray()
    }

}
