class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
     val m = matrix.size
     val n = matrix[0].size

     var start = 0
     var end = m * n - 1

     while(start <= end){
        var mid = start + (end - start) / 2

        var row = mid / n
        var col = mid % n

        var value = matrix[row][col]

        if(value == target){
            return true
        }
        else if(value < target){
            start = mid + 1
        }else{
            end = mid - 1
        }
     }  
     return false 
    }
}