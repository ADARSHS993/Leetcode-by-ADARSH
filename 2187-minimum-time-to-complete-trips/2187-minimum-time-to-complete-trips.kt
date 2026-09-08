class Solution {
    fun minimumTime(time: IntArray, totalTrips: Int): Long {
        
        var start = 1L
        var end = time.min().toLong() * totalTrips

        while(start <= end){
            val mid = start + (end - start) / 2

            var trips = 0L
            for(t in time){
                trips += mid.toLong() / t
            }

            if(trips >= totalTrips){
                end = mid - 1
            }else{
                start = mid + 1
            }
        }

        return start
    }
}