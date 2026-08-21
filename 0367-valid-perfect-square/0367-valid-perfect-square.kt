class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        if(num < 2){
            return true
        }

        var start = 2
        var end = num

        while(start <= end){
            val mid = start + (end - start) / 2
            val square = mid.toLong() * mid
            if(square == num.toLong()){
                return true
            }
            if(square > num){
                end = mid - 1
            }else{
                start = mid + 1
            }
        }
        return false
    }
}