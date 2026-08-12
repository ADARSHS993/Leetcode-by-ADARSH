class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        
        val sorted = score.sortedArrayDescending()

        val map = HashMap<Int,String>()

        for(i in sorted.indices){
            map[sorted[i]] = when(i){
                0 -> "Gold Medal"
                1 -> "Silver Medal"
                2 -> "Bronze Medal"

                else -> (i+1).toString()
            }
        }

        val res = Array(score.size) { "" }

        for(i in score.indices){
            res[i] = map[score[i]]!!
        }

        return res
    }
}