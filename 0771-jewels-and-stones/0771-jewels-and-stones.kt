class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
    
        val set = HashSet<Char>()

        for(ch in jewels){
            set.add(ch)
        } 

        var count = 0

        for(ch in stones){
            if(set.contains(ch)){
                count++
            }
        }

        return count
    }
}