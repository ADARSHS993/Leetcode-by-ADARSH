class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for(ch in s){
            when(ch){
                '(','{','[' -> stack.push(ch)

                ')' -> {
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false
                    }    
                }

                ']' -> {
                    if(stack.isEmpty() || stack.pop() != '[') {
                        return false
                    }
                }

                '}' -> {
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false
                    }
                }
        }
            }

            return stack.isEmpty()
        }
}