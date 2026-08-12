class Solution {
    fun largestNumber(nums: IntArray): String {
        
       val arr = nums.map { it.toString() }.toMutableList()

       arr.sortWith(Comparator { a,b ->
       (b + a).compareTo(a + b)
       })

       if(arr[0] == "0"){
        return "0"
       }

       return arr.joinToString("")
    }
}