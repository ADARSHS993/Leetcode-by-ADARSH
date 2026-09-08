class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var start = 1
        var end = 0

        for(pile in piles){
            end = Math.max(end,pile)
        }

        while(start <= end){

            val mid = start + (end - start) / 2

            var hours = 0L
            for(pile in piles){
                hours += (pile.toLong() + mid - 1) / mid
            }

            if(hours <= h){
                end = mid - 1
            }else{
                start = mid + 1
            }
        }

        return start
    }
}