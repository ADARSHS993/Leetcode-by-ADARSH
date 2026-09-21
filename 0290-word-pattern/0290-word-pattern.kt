class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {

        val words = s.split(" ")

        if(words.size != pattern.length){
            return false
        }

        val CharToWord = HashMap<Char,String>()
        val WordToChar = HashMap<String,Char>()

        for(i in pattern.indices){

            val ch = pattern[i]
            val word = words[i]

            if(CharToWord.contains(ch)){
                if(CharToWord[ch] != word){
                    return false
                }
            }

            if(WordToChar.contains(word)){
                if(WordToChar[word] != ch){
                    return false
                }
            }

            CharToWord[ch] = word
            WordToChar[word] = ch
        }
        return true
    }
}