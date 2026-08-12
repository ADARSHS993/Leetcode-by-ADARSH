class Solution {
    fun frequencySort(s: String): String {
        
        val map = HashMap<Char,Int>()

        for(str in s){
            map[str] = map.getOrDefault(str,0)+1
        }

        val list = map.keys.toMutableList()

        list.sortByDescending {
            map[it]
        }

        val result = StringBuilder()

        for (ls in list){
            repeat(map[ls]!!){
                result.append(ls)
            }
        }

        return result.toString()
    }
}