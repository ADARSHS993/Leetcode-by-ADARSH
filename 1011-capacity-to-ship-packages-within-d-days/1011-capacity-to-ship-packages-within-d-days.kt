class Solution {
    fun shipWithinDays(weights: IntArray, days: Int): Int {
        
        var start = 0
        var end = 0

        for(weight in weights){
            start = maxOf(start,weight)
            end += weight 
        }

        while(start <= end){

            val mid = start + (end - start) / 2

            var daysNeeded = 1
            var currentweight = 0
            for(weight in weights){
                if( currentweight + weight > mid){
                    daysNeeded++
                    currentweight = 0
                }
                currentweight += weight
            }

            if(daysNeeded <= days){
                end = mid - 1
            }else{
                start = mid + 1
            }
        }

        return start
    }
}