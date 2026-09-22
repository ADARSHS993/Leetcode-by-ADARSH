class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {

     val set1 = nums1.toSet()
     val set2 = nums2.toSet()

     val list1 = mutableListOf<Int>()
     val list2 = mutableListOf<Int>()

     for(num in set1){
        if(num !in set2){
            list1.add(num)
        }
     }

     for(num in set2){
        if(num !in set1){
            list2.add(num)
        }
     }

     return listOf(list1,list2)
    }
}