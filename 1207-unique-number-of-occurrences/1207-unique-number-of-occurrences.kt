class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        
        val map = HashMap<Int,Int>()

        for(num in arr){
            map[num] = map.getOrDefault(num,0)+1
        }

        val set = HashSet<Int>()

        for(frequency in map.values){

            if(set.contains(frequency)){
                return false
            }

            set.add(frequency)
        }

        return true
    }
}