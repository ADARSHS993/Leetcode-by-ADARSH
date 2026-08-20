class Solution {
    fun mySqrt(x: Int): Int {
        if(x < 2){
            return x
        }

        var s = 0
        var e = x    
        var result = 0
        while(s <= e){
            val mid = s + (e - s) / 2

            val square : Long = mid.toLong() * mid
            if(square <= x){
                result = mid
                s = mid + 1
            }else{
                e = mid - 1
            }
        }

        return result
    }
}