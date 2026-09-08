class Solution {
    fun findKthPositive(arr: IntArray, k: Int): Int {
        var start = 0
        var end = arr.size - 1

        while(start <= end){
            val mid = start + (end - start) / 2

            var missing = arr[mid] - (mid + 1)

            if(missing < k){
                start = mid + 1
            }else{
                end = mid - 1
            }
        }

        return start + k
    }
}