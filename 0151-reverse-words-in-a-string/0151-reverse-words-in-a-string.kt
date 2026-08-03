class Solution {
    fun reverseWords(s: String): String {
        val word = s.trim().split(" ")
        val list = mutableListOf<String>()
        for(i in word.size - 1 downTo 0){
            if(word[i].isNotEmpty()){
                list.add(word[i])
            }
        }

        return list.joinToString(" ")
    }

}