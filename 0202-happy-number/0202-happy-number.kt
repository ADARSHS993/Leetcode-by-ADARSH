class Solution {
    fun isHappy(n: Int): Boolean {

        val seen = HashSet<Int>()

        var num = n

        while(num != 1){

            if(seen.contains(num)){
                return false
            }

            seen.add(num)

            var sum = 0
            var temp = num
            while(temp > 0){
                val rem = temp % 10
                sum += rem * rem
                temp /= 10
            }

            num = sum
        }
        return true
    }
}