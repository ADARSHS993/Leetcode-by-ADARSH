class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        
        val map = HashMap<Int,Int>()
        val set = ArrayList<Int>()

        for(num in nums1){
            map[num] = map.getOrDefault(num,0)+1
        }

        for(num in nums2){

            if(map.getOrDefault(num,0) > 0){
                set.add(num)

                map[num] = map[num]!! - 1
            }
        }

        return set.toIntArray()

    }
}