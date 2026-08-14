class Solution {
    fun sortArray(nums: IntArray): IntArray {
       sort(nums,0,nums.size - 1)
       return nums
    }

    fun sort(nums : IntArray , s : Int , e : Int){

          if(s >= e){
            return 
        }

        var l = s
        var h = e
        val m = s + (e - s)/2
        val pivot = nums[m]

        while(l <= h){
            while(nums[l] < pivot){
                l++
            }
            while(nums[h] > pivot){
                h--
            }
            if(l <= h){
                swap(nums,l,h)
                l++
                h--
            }
        }
        sort(nums,s,h)
        sort(nums,l,e)
    }

    fun swap(nums : IntArray , first : Int , second : Int){
        val temp = nums[first]
        nums[first] = nums[second]
        nums[second] = temp
    }
}