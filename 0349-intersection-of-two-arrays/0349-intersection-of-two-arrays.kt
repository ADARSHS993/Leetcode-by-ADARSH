class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {

       var set = HashSet<Int>()
       var result = HashSet<Int>()

       for(num in nums1){
         set.add(num)
       }

       for(num in nums2){
        if(set.contains(num)){
            result.add(num)
        }
       }

       return result.toIntArray()
    }
}