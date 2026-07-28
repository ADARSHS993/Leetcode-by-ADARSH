class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val ans = IntArray(n)
        var ProdL = 1
        var ProdR = 1

        for(i in n - 1 downTo 0){
            ans[i] = ProdL
            ProdL = ProdL * nums[i]
        }

        for(i in 0 until n){
            ans[i] = ans[i] * ProdR
            ProdR = ProdR * nums[i]
        }
        return ans
    }
}