class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {

        val set = nums.toHashSet()
        val list = mutableListOf<Int>()
        for(i in 1..nums.size){
            if(i !in set){
                list.add(i)
            }
        }
        return list
    }
}