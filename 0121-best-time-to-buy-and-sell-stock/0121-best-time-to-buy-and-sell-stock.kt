class Solution {
    fun maxProfit(prices: IntArray): Int {
        var s_buy = Int.MAX_VALUE
        var max_profit = 0
        for(price in prices){
            s_buy = minOf(s_buy,price)
            val profit = price - s_buy
            max_profit = maxOf(max_profit,profit)
        }
        return max_profit
        }
}