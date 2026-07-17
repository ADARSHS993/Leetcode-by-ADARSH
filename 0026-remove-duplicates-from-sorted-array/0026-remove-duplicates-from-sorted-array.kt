class Solution {
    fun removeDuplicates(nums: IntArray): Int {
      if(nums.isEmpty()){
          return 0
      }

      var left = 0
      for(right in 1 until nums.size){
        if(nums[right] != nums[left]){
            left++
            nums[left] = nums[right]
        }
      }

      return left +  1
}
}